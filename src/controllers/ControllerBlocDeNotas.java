package controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import models.ModelBlocDeNotas;
import views.ViewBlocDeNotas;

public class ControllerBlocDeNotas {        
    private FileReader fr = null;
    private final JFileChooser jfc = new JFileChooser();
    private FileWriter writer;
    ModelBlocDeNotas model_bloc_de_notas;
    ViewBlocDeNotas view_bloc_de_notas;
    
    public ControllerBlocDeNotas(ModelBlocDeNotas model_bloc_de_notas, ViewBlocDeNotas view_bloc_de_notas){
        this.model_bloc_de_notas = model_bloc_de_notas;
        this.view_bloc_de_notas = view_bloc_de_notas;           
        view_bloc_de_notas.jbtn_abrir.addActionListener(e->jbtn_abrir());
        view_bloc_de_notas.jbtn_guardar.addActionListener(e->jbtn_guardar());        
        initView();
    }
    public void initView(){
        view_bloc_de_notas.setVisible(true);
    }               
    private void jbtn_abrir(){
        try{
            jfc.showOpenDialog(view_bloc_de_notas);
            model_bloc_de_notas.setArchivo(jfc.getSelectedFile());
            fr = new FileReader (model_bloc_de_notas.getArchivo());
            int c = 0;
            String t = "";
            while((c=fr.read())!=-1){
                t+= (char) c;
            }
            fr.close();
            view_bloc_de_notas.jta_archivo.setText(t);            
        }
        catch(FileNotFoundException e){
            System.err.println("Error");
        }
        catch(IOException e){
            System.err.println("Error");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException e){
                System.err.println("Error");
            }
        }
        
    }
    private void jbtn_guardar(){
        try {            
            writer = new FileWriter(model_bloc_de_notas.archivo,false);          
            writer.write(view_bloc_de_notas.jta_archivo.getText());
            writer.close();
        }catch(FileNotFoundException e){
            System.err.println("Error");
        }
        catch(IOException e){
            System.err.println("Error");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException e){
                System.err.println("Error");
            }
        }
    }        
}
