
package dictionary;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class DictionaryManagement {

    Dictionary dictionary = new Dictionary();

    Scanner sc = new Scanner(System.in);

    public void insertFromCommandline() {


        int soluong = sc.nextInt();
        for (int i = 0; i < soluong; i++) {
            String Anh = sc.next();
            String Viet = sc.next();
            Word newWord = new Word();
            newWord.setWord_taget(Anh);
            newWord.setWord_explain(Viet);
            dictionary.listWord.add(newWord);
        }
    }
public void insertFromFile() {
        try {
            File file = new File("bangtu.txt");
            FileReader fileReader = new FileReader(file);
            try (BufferedReader reader = new BufferedReader(fileReader)) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    String doantu[] = line.split("\t");
                    Word new_word = new Word();
                    new_word.setWord_taget(doantu[0]);
                    new_word.setWord_explain(doantu[1]);
                    dictionary.listWord.add(new_word);
                }
              
            }
        } catch (Exception e) {
           
        }
    }
    public void dictionaryLookup() {
        String findViet = sc.nextLine();
        for (int i = 0; i < dictionary.listWord.size(); i++) {
            if (findViet.equals(dictionary.listWord.get(i).getWord_taget())) {
                System.out.println(dictionary.listWord.get(i).getWord_explain());
                break;
        }
    }
    }
    public void addWord(){
        Word newWord = new Word();
        System.out.print("English: ");
        String newEng = sc.nextLine();
        newWord.setWord_taget(newEng);
        
        System.out.print("Vietnamese: ");
        String newViet = sc.nextLine();
        
        newWord.setWord_explain(newViet);
        dictionary.listWord.add(newWord);
    }
    
    public void changeWord(){
        System.out.print("Mời nhập từ cần sửa chữa: ");
        String changeword = sc.nextLine();
        System.out.print("Thay đổi English Word: ");
                String e = sc.nextLine();
        System.out.print("Thay đổi English Word: ");
                String v = sc.nextLine();
        for(int i = 0; i<dictionary.listWord.size(); i++){
            if(changeword.equals(dictionary.listWord.get(i).getWord_taget())){
                dictionary.listWord.get(i).setWord_taget(e);
                dictionary.listWord.get(i).setWord_explain(v);
            }    
        }
    }
    


    public void delWord(){
        System.out.print("Nhập từ cần xóa:");
        String delword = sc.nextLine();
        for (int i = 0; i< dictionary.listWord.size(); i++){
            if(delword.equals(dictionary.listWord.get(i).getWord_taget())){
                dictionary.listWord.remove(dictionary.listWord.get(i));
            }
        }
    }

    public void outputFile(){
        try {
            FileOutputStream file = new FileOutputStream("bangtu.txt");
            DataOutputStream data = new DataOutputStream(file);
            for(int i = 0; i<dictionary.listWord.size(); i++){
                data.writeBytes(dictionary.listWord.get(i).getWord_taget()+"\t"+dictionary.listWord.get(i).getWord_explain()+"\n");
                
                
            }            
        } catch(Exception e){
           
        }
    }
}