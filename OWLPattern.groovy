import org.semanticweb.owlapi.io.* 
import org.semanticweb.owlapi.model.*
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary
import org.coode.owlapi.manchesterowlsyntax.*

public class OWLPattern {

  String pat = null

  public OWLPattern (String s) {
    pat = s // check syntax: insert owl:Thing for ?X and ?Y, then use OWLAPI
    
  }

}