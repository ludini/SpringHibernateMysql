package com.csstock.modle;

import java.util.HashSet;
import java.util.Set;


/**
 * Column generated by MyEclipse Persistence Tools
 */

public class Column  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	 private Integer id;     
     private DocumentType documentType;     
     private ColumnType columnType;     
     private int parentColumnID;     
     private String name;    
     private String description;     
     private String catalog;
     private String fileName;     
     private int auditing;
     private String content;
     
     private String property1;
     private String property2;
     private String property3;
     private String property4;
     private String property5;
     private String property6;
     private String property7;
     private String property8;
     private String property9;
     private String property10;
     private String property11;
     private String property12;
     private String property13;
     private String property14;
     private String property15;
     private String columnPic;
         
//     private Set<Column> childColumns = new HashSet<Column>(0);


    /** default constructor */
    public Column() {
    }

	/** minimal constructor */
    public Column(Integer id, DocumentType documentType,  int parentColumnID,  String name, String catalog, String fileName, int auditing,String content) {
        this.id = id;
        this.documentType = documentType;
        this.parentColumnID = parentColumnID;
        this.name = name;
        this.catalog = catalog;
        this.fileName = fileName;
        this.auditing = auditing;
        this.content = content;
    }
    
    /** full constructor */
    public Column(Integer id, DocumentType documentType, int parentColumnID,  String name, String description, String catalog, String fileName, short auditing, Set<Column> ChildColumns,String content) {
        this.id = id;
        this.documentType = documentType;
        this.parentColumnID = parentColumnID;
        this.name = name;
        this.description = description;
        this.catalog = catalog;
        this.fileName = fileName;
        this.auditing = auditing;
        this.content = content;
//        this.childColumns = ChildColumns;
    }

   

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public DocumentType getDocumentType() {
        return this.documentType;
    }
    
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public ColumnType getColumnType() {
        return this.columnType;
    }
    
    public void setColumnType(ColumnType columnType) {
        this.columnType = columnType;
    }
    
    

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatalog() {
        return this.catalog;
    }
    
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getAuditing() {
        return this.auditing;
    }
    
    public void setAuditing(short auditing) {
        this.auditing = auditing;
    }

	public void setAuditing(int auditing) {
		this.auditing = auditing;
	}

	 public String getProperty1() {
        return this.property1;
    }
    
    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return this.property2;
    }
    
    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public String getProperty3() {
        return this.property3;
    }
    
    public void setProperty3(String property3) {
        this.property3 = property3;
    }

    public String getProperty4() {
        return this.property4;
    }
    
    public void setProperty4(String property4) {
        this.property4 = property4;
    }

    public String getProperty5() {
        return this.property5;
    }
    
    public void setProperty5(String property5) {
        this.property5 = property5;
    }

    public String getProperty6() {
        return this.property6;
    }
    
    public void setProperty6(String property6) {
        this.property6 = property6;
    }
    
    public String getProperty7() {
        return this.property7;
    }
    
    public void setProperty7(String property7) {
        this.property7 = property7;
    }

    public String getProperty8() {
        return this.property8;
    }
    
    public void setProperty8(String property8) {
        this.property8 = property8;
    }

    public String getProperty9() {
        return this.property9;
    }
    
    public void setProperty9(String property9) {
        this.property9 = property9;
    }

    public String getProperty10() {
        return this.property10;
    }
    
    public void setProperty10(String property10) {
        this.property10 = property10;
    }

    public String getProperty11() {
        return this.property11;
    }
    
    public void setProperty11(String property11) {
        this.property11 = property11;
    }

    public String getProperty12() {
        return this.property12;
    }
    
    public void setProperty12(String property12) {
        this.property12 = property12;
    }

    public String getProperty13() {
        return this.property13;
    }
    
    public void setProperty13(String property13) {
        this.property13 = property13;
    }

    public String getProperty14() {
        return this.property14;
    }
    
    public void setProperty14(String property14) {
        this.property14 = property14;
    }

    public String getProperty15() {
        return this.property15;
    }
    
    public void setProperty15(String property15) {
        this.property15 = property15;
    }
    public String getColumnPic() {
        return this.columnPic;
    }
    
    public void setColumnPic(String columnPic) {
        this.columnPic = columnPic;
    }
    
	public int getParentColumnID() {
		return parentColumnID;
	}

	public void setParentColumnID(int parentColumnID) {
		this.parentColumnID = parentColumnID;
	}

}