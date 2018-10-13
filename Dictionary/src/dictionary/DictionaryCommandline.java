
package dictionary;

import java.util.Scanner;

public class DictionaryCommandline {
    Scanner input = new Scanner(System.in);
    
    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    


    public void showAllWords(){
        System.out.println("NO  |English            |Vietnamese");
        for(int i = 0; i < dictionaryManagement.dictionary.listWord.size(); i++) {
            System.out.printf("%-5s%-20s%s\n",i+1,dictionaryManagement.dictionary.listWord.get(i).getWord_taget(),dictionaryManagement.dictionary.listWord.get(i).getWord_explain());
        }
    }
    

    public void dictionaryBasic(){
        dictionaryManagement.insertFromFile();
        showAllWords();

    }

    public void dictionaryAdvanced(){
        dictionaryManagement.insertFromFile();
        System.out.println("WELCOME TO THE LIBRARY!");
        System.out.println("Để thêm từ điền gõ add."+"\n"+"Để xóa từ gõ del."+"\n"+"Để tra từ gõ lookup."+"\n"+"Để sửa từ gõ repair."+"\n"+"Để tìm kiếm các từ bắt đầu bằng 1 vài kí tự gõ search."+"\n"+"Thank you!");
        String action = input.next();
        if(action.equals("add")){
            dictionaryManagement.addWord();
            showAllWords();
        } else if(action.equals("del")){
            dictionaryManagement.delWord();
            showAllWords();
        } else if(action.equals("lookup")){
            dictionaryManagement.dictionaryLookup(); 
        } else if(action.equals("repair")){
            dictionaryManagement.changeWord();
            showAllWords();
        } else if(action.equals("search")){
            dictionarySearcher();
        } else {
            System.out.print("Nhập sai, mời nhập lại.");
        }
        //dictionaryManagement.changeWord();
        //dictionaryManagement.delWord();
        //dictionaryManagement.addWord();
        //dictionaryManagement.dictionaryLookup();
        //dictionaryManagement.outputFile();
        //dictionarySearcher();
    }
    public void dictionarySearcher() {
        
        String kt = input.next();
        for(int i = 0; i<dictionaryManagement.dictionary.listWord.size(); i++){
            if (dictionaryManagement.dictionary.listWord.get(i).getWord_taget().startsWith(kt) == true)
                System.out.println(dictionaryManagement.dictionary.listWord.get(i).getWord_taget());
            
        }
    }
    public static void main(String[] args) {
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        dictionaryCommandline.dictionaryAdvanced();
       
        
    }
}

