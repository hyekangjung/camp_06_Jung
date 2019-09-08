package com.company;

import java.util.Scanner;

public class colLesson02 {
    public static void main(String[] args) {
      /*  • 文字をよみとるループは while文を使ってください(for文は☓)
          • 登録終了後、forループ、println()メソッドにて出力*/
            Word[] words = new Word[10];

            System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
        /*String[] word = new String[10];
        String[] meaning =new String[10];*/
            int index = 0;
            while (!input.equals("e")) {
                String[] insert = input.split(" ");
                Word tmp = new Word(insert[0], insert[1]);
                words[index] = tmp;
                index++;
                System.out.println("次の単語と意味を入力して下さい。eで終了します。");
                input = sc.nextLine();
            }
            System.out.println("終了します。");
            for (int i = 0; i <index; i++) {
            System.out.println(words[i]);
            }
            System.out.println( index+ "件、登録しました。");



           /* String[] insert = input.split(" ");
            word[i] = insert[0];
            meaning[i] = insert[1];
            i++;*/




        }


    }
