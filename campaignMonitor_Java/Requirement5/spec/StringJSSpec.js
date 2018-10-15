describe("Valid Prefix",function (){  

   it("First word only",function (){   
      expect("hang the dj".startsWith("hang")).toBeTruthy();    
   });
   
   it("Last word only",function (){   
      expect("hang the dj".startsWith("dj")).toBeFalsy();    
   });

	it("First word with space at the beginning",function (){   
      expect("hang the dj".startsWith(" hang")).toBeFalsy();    
   });    
   
   it("First word with capital",function (){   
      expect("hang the dj".startsWith("Hang")).toBeFalsy();    
   }); 
   
   it("Totally different sentence",function (){   
      expect("hang the dj".startsWith("Sample check")).toBeFalsy();    
   }); 
   
   it("Blank",function (){   
      expect("hang the dj".startsWith("")).toBeTruthy();    
   }); 
   
   it("Space",function (){   
      expect("hang the dj".startsWith(" ")).toBeFalsy();    
   }); 
   
   it("First two words",function (){   
      expect("hang the dj".startsWith("hang the")).toBeTruthy();    
   }); 
   
   it("All three words",function (){   
      expect("hang the dj".startsWith("hang the dj")).toBeTruthy();    
   }); 
   
   it("Part of first word",function (){   
      expect("hang the dj".startsWith("han")).toBeTruthy();    
   });
   
   it("Part of sentence",function (){   
      expect("hang the dj".startsWith("hang t")).toBeTruthy();    
   });
   
   it("Part of first word",function (){   
      expect("hang the dj".startsWith("ang the dj")).toBeFalsy();    
   });
   
   it("All three words with space at the end",function (){   
      expect("hang the dj".startsWith("hang the dj ")).toBeFalsy();    
   });

	it("Number",function (){   
      expect("hang the dj".startsWith("42")).toBeFalsy();    
   });  

   it("Invalid String",function (){   
      expect("hang the dj".startsWith("{ first: “Johnny” }")).toBeFalsy();    
   });      
   
   it("All three words with char in between",function (){   
      expect("hang the dj".startsWith("hang -the dj ")).toBeFalsy();    
   });
}); 



describe("Valid Suffix",function (){  

   it("First word only",function (){   
      expect("hang the dj".endsWith("hang")).toBeFalsy();    
   });
   
   it("Last word only",function (){   
      expect("hang the dj".endsWith("dj")).toBeTruthy();    
   });

	it("Last word with space at the end",function (){   
      expect("hang the dj".endsWith(" dj ")).toBeFalsy();    
   });    
   
   it("Word with capital",function (){   
      expect("hang the dj".endsWith("Dj")).toBeFalsy();    
   }); 
   
   it("Totally different sentence",function (){   
      expect("hang the dj".endsWith("Sample check")).toBeFalsy();    
   }); 
   
   it("Blank",function (){   
      expect("hang the dj".endsWith("")).toBeTruthy();    
   }); 
   
   it("Space",function (){   
      expect("hang the dj".endsWith(" ")).toBeFalsy();    
   }); 
   
   it("Last two words",function (){   
      expect("hang the dj".endsWith("the dj")).toBeTruthy();    
   }); 
   
   it("All three words",function (){   
      expect("hang the dj".endsWith("hang the dj")).toBeTruthy();    
   }); 
   
   it("Part of last word",function (){   
      expect("hang the dj".endsWith("j")).toBeTruthy();    
   });
   
   it("Part of sentence",function (){   
      expect("hang the dj".endsWith("he dj")).toBeTruthy();    
   });
   
   it("Part of last word",function (){   
      expect("hang the dj".endsWith("hang the d")).toBeFalsy();    
   });
   
   it("All three words with space at the end",function (){   
      expect("hang the dj".endsWith("hang the dj ")).toBeFalsy();    
   });

	it("Number",function (){   
      expect("hang the dj".endsWith("42")).toBeFalsy();    
   });  

   it("Invalid String",function (){   
      expect("hang the dj".endsWith("{ first: “Johnny” }")).toBeFalsy();    
   });      
   
   it("All three words with char in between",function (){   
      expect("hang the dj".endsWith("hang -the dj ")).toBeFalsy();    
   });
}); 