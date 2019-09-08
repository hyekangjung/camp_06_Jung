package com.company;

import java.util.Scanner;
/*英単語/日本語を保持するクラス「 Word.java」
        • word(String)、meaning(String)の属性を定義 • コンストラクタを定義*/

public class Word {
    public String word;
    public String meaning;


    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
    public String toString(){
        return "単語:"+this.word+"意味:"+this.meaning;
    }
}
