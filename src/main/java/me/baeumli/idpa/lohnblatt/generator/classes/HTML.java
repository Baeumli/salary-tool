/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

/**
 *
 * @author Baeumli
 */
public class HTML {
    
    private String content = "<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <style>\n" +
"        .header {\n" +
"            font-size: 20px;\n" +
"            font-weight: bold;\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"<body>\n" +
"    <h1>Lohnblatt</h1>\n" +
"    <table style=\"width:100%\">\n" +
"        <tr align=\"left\">\n" +
"            <th>Bezeichnung</th>\n" +
"            <th>Prozentsatz</th>\n" +
"            <th>Basis</th>\n" +
"            <th>Betrag</th>\n" +
"            <th>Total</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td class=\"header\">Lohnarten</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>Monatslohn</td>\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td>32'000</td>\n" +
"            <td></td>\n" +
"        </tr>\n" +
"        <tr class=\"header\">\n" +
"            <td>Bruttolohn</td>\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td>32'000</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td class=\"header\">Abzugsarten</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>AHV/IV/EO</td>\n" +
"            <td>5.1250% von</td>\n" +
"            <td>32'000</td>\n" +
"            <td>666</td>\n" +
"            <td></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>ALV</td>\n" +
"            <td>1.1000% von</td>\n" +
"            <td>32'000</td>\n" +
"            <td>666</td>\n" +
"            <td></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>NBUV</td>\n" +
"            <td>1.1900% von</td>\n" +
"            <td>32'000</td>\n" +
"            <td>666</td>\n" +
"            <td></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>Pensionskasse</td>\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td>666</td>\n" +
"            <td></td>\n" +
"        </tr>\n" +
"        <tr style=\"width: px;\">\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td style=\"font-weight: bold;\">88998</td>\n" +
"        </tr>\n" +
"        <tr class=\"header\">\n" +
"            <td>Nettolohn</td>\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td></td>\n" +
"            <td>32'000</td>\n" +
"        </tr>\n" +
"        <tr class=\"header\">\n" +
"                <td>Auszahlung</td>\n" +
"                <td></td>\n" +
"                <td></td>\n" +
"                <td></td>\n" +
"                <td>32'000</td>\n" +
"            </tr>\n" +
"    </table>\n" +
"</body>\n" +
"</html>";

    public String getContent() {
        return content;
    }

    
    
    
}
