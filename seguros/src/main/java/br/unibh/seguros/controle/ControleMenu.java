package br.unibh.seguros.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "menumb")
@ViewScoped
public class ControleMenu {
	private String orientation = "horizontal";
	 
    public String getOrientation() {
        return orientation;
    }
 
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
