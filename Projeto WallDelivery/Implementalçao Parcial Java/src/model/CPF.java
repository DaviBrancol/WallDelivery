package model;

import Exceptions.CPFInvalidException;
import Exceptions.CPFNumberFormatException;
import Exceptions.CPFSizeException;
import Exceptions.SizeException;
import java.io.Serializable;
import java.util.ArrayList;

public class CPF implements Serializable{

    private ArrayList<Integer> numbers;

    public CPF() {
    }

    public CPF(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public void validateCPF(String texto) {
        String[] nums = texto.split("");
        this.numbers = new ArrayList<>();

        if (nums.length == 0) {
            throw new SizeException("CPF");
        }
        if (nums.length != 11) {
            throw new CPFSizeException();
        } else {
            for (int i = 0; i < nums.length; i++) {
                try {
                    int temp = Integer.parseInt(nums[i]);
                    numbers.add(temp);

                } catch (NumberFormatException e) {
                    throw new CPFNumberFormatException();
                }
            }

            int primeiroDigito, segundoDigito, quociente, resto, soma = 0;

        for (int i = 0; i < numbers.size() - 2; i++) {
            soma += (10 - i) * numbers.get(i);
        }

        quociente = (int) soma / 11;
        resto = soma % 11;

        if (resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }

        if (primeiroDigito == numbers.get(9)) {
            soma = 0;

            for (int i = 0; i < numbers.size() - 1; i++) {
                if (i < 9) {
                    soma += (11 - i) * numbers.get(i);
                } else {
                    soma += (11 - i) * primeiroDigito;
                }

            }

            quociente = (int) soma / 11;
            resto = soma % 11;

            if (resto < 2) {
                segundoDigito = 0;
            } else {
                segundoDigito = 11 - resto;
            }

            if (segundoDigito != numbers.get(10)) {
                throw new CPFInvalidException();
            }
        } else {
            throw new CPFInvalidException();
        }
      }
    }
    
    // ToString
    @Override
    public String toString() {
        String str = "";
        int cont = 0;

        for (int i = 0; i < this.numbers.size(); i++) {
            str += this.numbers.get(i);
            cont++;

            if (cont % 3 == 0) {
                if (cont < 7) {
                    str += ".";
                } else {
                    str += "-";
                }
            }
        }

        return str;
    }

}