/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vincedgy.mbeans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Vincent
 */
@Named(value = "layoutMBean")
@SessionScoped
public class LayoutMBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String theme = "afternoon"; // default theme

    private List<String> themesList;

    public List<String> getThemesList() {
        return themesList;
    }

    public void setThemesList(List<String> themesList) {
        this.themesList = themesList;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * Creates a new instance of LayoutMBean
     */
    public LayoutMBean() {
    }

    public void themeChangeListener(ValueChangeEvent event) throws IOException {
        // Get the choosen theme
        System.out.println("Value change !");
        setTheme((String) event.getNewValue().toString());
        // Redirect
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    }

    @PostConstruct
    void init() {
        themesList = new ArrayList<>();
//        themesList.add("none");
//        themesList.add("afterdark");
        themesList.add("firstEETheme"); //
        themesList.add("afternoon"); //
        themesList.add("afterwork"); //
//        themesList.add("aristo");
//        themesList.add("black-tie");
        themesList.add("blitzer");
        themesList.add("bluesky"); //
//        themesList.add("bootstrap");
//        themesList.add("casablanca");
//        themesList.add("cruze");
//        themesList.add("cupertino");
//        themesList.add("dark-hive");
//        themesList.add("delta");
//        themesList.add("dot-luv");
//        themesList.add("eggplant");
//        themesList.add("excite-bike");
//        themesList.add("flick");
//        themesList.add("glass-x");
//        themesList.add("home");
//        themesList.add("hot-sneaks");
//        themesList.add("humanity");
//        themesList.add("le-frog");
//        themesList.add("midnight");
//        themesList.add("mint-choc");
//        themesList.add("overcast");
//        themesList.add("pepper-grinder");
        themesList.add("redmond"); //
//        themesList.add("rocket");
//        themesList.add("sam");
//        themesList.add("smoothness");
//        themesList.add("south-street");
//        themesList.add("start");
//        themesList.add("sunny");
//        themesList.add("swanky-purse");
//        themesList.add("trontastic");
//        themesList.add("ui-darkness");
        themesList.add("ui-lightness"); //
//        themesList.add("vader");
    }

}
