package org.smadl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.smadl.smadl.Entity

class SMADLGenerator implements IGenerator {
    
    override doGenerate(Resource input, IFileSystemAccess fsa) {
        /* This code has no use unless an OutputProvider is set up */
        var list = (input.contents.head as Entity).eContents
        var content = ""
        for(i : list) {
            content = content + i.class + "\n"
        }
        fsa.generateFile("Teste.xtend", toXtendCode(content))
    }
    
    /* This code has no use unless an OutputProvider is set up */
    def toXtendCode(String testing) '''
        class Teste {
            def static void main(String[] args) {
                println("testing IGenerator approach to code generation")
                /*
                «testing»
                */
            }
        }
    '''
    

}