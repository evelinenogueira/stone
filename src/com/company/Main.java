package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Item itemA = new Item("ovo", 1, 100);

        List<String> pagantes = new ArrayList<String>();

        pagantes.add("evelinecontato@gmail.com");
        pagantes.add("teste@test.com");
        pagantes.add("outroteste@test.com");
        pagantes.add("outroteste@test.com");

        int quantidadeDePessoas = pagantes.size();

        int totalAPagar = Item.getValorAPagar();

        int valorPorPessoa = totalAPagar/quantidadeDePessoas;

        int sobra = totalAPagar%quantidadeDePessoas;

        System.out.println(quantidadeDePessoas-sobra+ " irão pagar "+valorPorPessoa+
                ", e "+sobra+" irá(ão) pagar "+(valorPorPessoa+(sobra/sobra)));



        //  Scanner scanner = new Scanner(System.in);

        //  while (!scanner.hasNext("fim")) {
        //      String email = scanner.nextLine();
        //     pagantes.add(email);
        //}


    }

}
