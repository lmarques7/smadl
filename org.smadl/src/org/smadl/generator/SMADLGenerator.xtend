package org.smadl.generator

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.smadl.smadl.Entity

class SMADLGenerator implements IGenerator {
    
    override doGenerate(Resource input, IFileSystemAccess fsa) {
        var List l = (input.contents.head as Entity).eContents
        var content = ""
        for(i : l) {
            content = content + i.class + "\n"
        }
        fsa.generateFile("Teste.xtend", toXtendCode(content))
    }
    
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