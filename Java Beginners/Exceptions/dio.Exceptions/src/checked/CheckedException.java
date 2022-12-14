package checked;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.

public class CheckedException {

    public static void main(String[] args) {

        String nomeArquivo = "Star Trek.txt";

        try {
            imprimirArquivoNoConsole(nomeArquivo);//Como o arquivo não existe, sempre vai cair numa exceção.
        } catch (FileNotFoundException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que deseja imprimir."+e.getCause());
        }
        catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado."+
                    "Entre em contato com o suporte" + e.getCause());
            e.printStackTrace();
        }finally{
            System.out.println("Chegou o finally.");
        }

        System.out.println("Apesar da exception, ou não, o programa continua!");

    }

    public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {

        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{

            bw.write(line);
            bw.newLine();
            line = br.readLine();

        }while(line != null);

        bw.flush();
        br.close();
    }

}
