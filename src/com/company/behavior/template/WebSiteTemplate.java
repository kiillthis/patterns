package com.company.behavior.template;

public abstract class WebSiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    protected abstract void showPageContent();

}
