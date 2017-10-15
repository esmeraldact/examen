package controllers;

import models.ModelPrincipal;
import views.ViewBlocDeNotas;
import views.ViewMayor;
import views.ViewOrdenar;
import views.ViewOperaciones;
import views.ViewPrincipal;

public class ControllerPrincipal {
    private ModelPrincipal modelp;
    private ViewPrincipal vistap;
    private ViewMayor vistam;
    private ViewOrdenar vistao;
    private ViewOperaciones vistao2;
    private ViewBlocDeNotas blocn;
    private ControllerPrincipal controllerp;
    
    public ControllerPrincipal(ModelPrincipal mp, Object views[]){
        this.modelp=mp;
        this.vistap=(ViewPrincipal)views[4];
        this.vistam=(ViewMayor)views[0];
        this.vistao=(ViewOrdenar)views[1];
        this.vistao2=(ViewOperaciones)views[2];
        this.blocn=(ViewBlocDeNotas)views[3];
        this.vistap.jmi_ordenar.addActionListener(e->jmi_ordenar2_clic());
        this.vistap.jmi_bloc_de_notas.addActionListener(e->jmi_bloc_notas_clic());       
        this.vistap.jmi_mayor.addActionListener(e->jmi_mayor_clic());
        this.vistap.jmi_operaciones.addActionListener(e->jmi_ordenar_clic());               
        initView();
    }
    private void initView(){
        this.vistap.setVisible(true);
    }
    public void jmi_mayor_clic(){
        this.vistap.setContentPane(vistam);
        this.vistap.revalidate();
        this.vistap.repaint();
    }
    public void jmi_ordenar_clic(){
        this.vistap.setContentPane(vistao);
        this.vistap.revalidate();
        this.vistap.repaint();
    }
    public void jmi_ordenar2_clic(){
        this.vistap.setContentPane(vistao2);
        this.vistap.revalidate();
        this.vistap.repaint();
    }
    public void jmi_bloc_notas_clic(){
        this.vistap.setContentPane(blocn);
        this.vistap.revalidate();
        this.vistap.repaint();
    }    
}
