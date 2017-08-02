package com;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.LocalizedTextProvider;
import com.opensymphony.xwork2.inject.Inject;

public class DateConverter extends StrutsTypeConverter {

    private LocalizedTextProvider localizedTextProvider;

    @Inject
    public void setLocalizedTextProvider(LocalizedTextProvider localizedTextProvider) {
        this.localizedTextProvider = localizedTextProvider;
    }

    public DateConverter() {
        System.out.println("DateConverter.DateConverter()");
    }

    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        System.out.println("DateConverter.convertFromString() localizedTextProvider=" +
                                      localizedTextProvider);
        return null;
    }

    @Override
    public String convertToString(Map context, Object obj) {
        System.out.println("DateConverter.convertToString() localizedTextProvider=" +
                                      localizedTextProvider);
        return "";
    }
}
