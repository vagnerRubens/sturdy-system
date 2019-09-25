package qualiscaps.csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class QualisCapsCsv {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    ArrayList caps;
        caps = new ArrayList();
        String csvArquivo;
        csvArquivo = "C:\\Users\\Vagner\\Desktop\\QualisCapes.csv";
    BufferedReader conteudoCSV = null;
    
    String linha = "";
    
    String csvSeparadorCampo = ";";
    
    try{     
      conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
      
        while ((linha = conteudoCSV.readLine()) !=null){
          String[] periodico = linha.split(csvSeparadorCampo);
            String inss = periodico[0];
            String titulo = periodico[1];
            String area_avaliacao = periodico[2];
            String estrato = periodico[3];
             /* System.out.println("[INSS = " + periodico[0]
                 + "; Titulo = " + periodico[1]
                 + "; Área de Avaliação = " + periodico[2] 
                 + "; Estrato = " + periodico[3] + "]");*/
            System.out.println("INSS " + inss + ";Titulo " + titulo + "; Área de Avaliação " + area_avaliacao +";" + "Estrato " + estrato);
}
    }catch(IOException e) {
        
        System.out.println("IO Erro: \n"+e.getMessage());
    }finally{
        if(conteudoCSV != null) {
            try{
                conteudoCSV.close();
            } catch (IOException e) {
                System.out.println("IO Erro:\n"+e.getMessage());
            }
        }
    }
  }
 }
    

