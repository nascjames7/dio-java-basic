package exception.customer;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada1 {

    public static void main(String[] args) {

        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido.");

        /*try {
            imprimirArquivoNoConsole(nomeArquivo);//Como o arquivo não existe, sempre vai cair numa exceção.
        } catch (FileNotFoundException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que deseja imprimir."+e.getCause());
        }
        finally{
            System.out.println("Chegou o finally.");
        }*/

        System.out.println("Apesar da exception, ou não, o programa continua!");

    }

    public static void imprimirArquivoNoConsole(String nomeArquivo) {

        File file = new File(nomeArquivo);

        try{

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {

            bw.write(line);
            bw.newLine();
            line = br.readLine();

        } while (line != null);

        bw.flush();
        br.close();

    }catch (IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado." +
                    "Entre em contato com o suporte" + e.getCause());
            e.printStackTrace();
        }
    }
    public static BufferedReader lerArquivo (String nomeArquivo) throws ImpossivelAberturaDeArquivoException {

        File file = new File(nomeArquivo);

        try {
            return new BufferedReader(new FileReader (nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());

        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception{

    private String nomeArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo " + nomeArquivo + "não foi encontrado no diretório "+ diretorio+ ".");
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
