
package trabalho;

public class Trabalho { //classe
    
    public static void main(String[] args) {
       //método construtor Address()
       // alocação de memória - new
       // objeto addAmanda
       Address addAmanda = new Address(); 
       addAmanda.setCep("69783430");
       addAmanda.setPublicPlace("Rapaport");
       addAmanda.setUf("RO");
       addAmanda.setCity("Jaru");
       
       //método construtor User()
       // alocação de memória - new
       // objeto amanda
       User amanda = new User(); 
       amanda.setRegistration(01);
       amanda.setName("Amanda");
       amanda.setLastname("Oliveira");
       amanda.setEmail("amand@gmail.com");
       amanda.setPassword("9875");
       amanda.setAddress(addAmanda);
       
       //método construtor Course()
       // alocação de memória - new
       // objeto administracao
       Course administracao = new Course(); 
       administracao.setCodeCourse(123);
       administracao.setName("Administracao");
       
       //método construtor Student()
       // alocação de memória - new
       // objeto stdAmanda
       Student stdAmanda = new Student(); 
       stdAmanda.setYearRegistration(2019);
       stdAmanda.setCurrentSemester(4);
       stdAmanda.setCourse(administracao);
         
    }
}
