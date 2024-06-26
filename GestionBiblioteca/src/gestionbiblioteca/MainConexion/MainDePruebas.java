package gestionbiblioteca.MainConexion;

import gestionbiblioteca.AccesoADatos.LibrosData;
import gestionbiblioteca.AccesoADatos.MultasData;
import gestionbiblioteca.AccesoADatos.PrestamosData;
import gestionbiblioteca.AccesoADatos.UsuariosData;

import gestionbiblioteca.Entidades.Libros;
import gestionbiblioteca.Entidades.Multas;
import gestionbiblioteca.Entidades.Prestamos;
import gestionbiblioteca.Entidades.Usuarios;
import java.time.LocalDate;
import java.util.List;

public class MainDePruebas {

    public static void main(String[] args) {
        LibrosData librosData = new LibrosData();
        UsuariosData usuariosData = new UsuariosData();
        MultasData multasData = new MultasData();
        PrestamosData prestamosData = new PrestamosData();
        Prestamos prestamo = new Prestamos();

//------------------------------------------------------------------------------------------------------------------------------    
//------------------------------------------------PRUEBA METODOS LIBROS DATA!!!!!!----------------------------------------------
//        //-------------------Prueba del método guardarLibro-----------FUNCAAAA----------------
//        Libros libroNuevo = new Libros();
//        libroNuevo.setTitulo("El señor de los anillos");
//        libroNuevo.setAutor("J.R.R. Tolkien");
//        libroNuevo.setIsbn("9788445000663");
//        libroNuevo.setGenero("Fantasía");
//        libroNuevo.setAnioPublicacion(1954);
//
//        librosData.guardarLibro(libroNuevo);
//
//------------------------------------------------------------------------------------------------------------------------------  
        //-------------------Prueba del método modificarLibro--------FUNCAAAA-------------------
//      Libros libroExistente = new Libros();
//      libroExistente.setIdLibro(2);              // Establecer el ID del libro que quiero modificar
//      libroExistente.setTitulo("El Señor De Los Anillos");
//      libroExistente.setAutor("J.R.R. Tolkien");
//      libroExistente.setIsbn("12345"); 
//      libroExistente.setGenero("Fantasía");
//      libroExistente.setAnioPublicacion(1954);
//      librosData.modificarLibro(libroExistente);
//
//------------------------------------------------------------------------------------------------------------------------------  
//        //-------------------Prueba del método eliminarLibro--------FUNCAAAA-------------------
//
//        librosData.eliminarLibro("9788445000663");
//
//------------------------------------------------------------------------------------------------------------------------------  
//        // Prueba del método buscarLibroPorISBN--------FUNCAAAA-------------------
//        Libros libroBuscadoPorISBN = librosData.buscarLibroPorISBN("9788445000663");
//        if (libroBuscadoPorISBN != null) {
//            System.out.println("Libro encontrado por ISBN: " + libroBuscadoPorISBN.getTitulo());
//        }
//
//------------------------------------------------------------------------------------------------------------------------------  
//        // Prueba del método buscarLibrosPorNombre
//        List<Libros> librosPorNombre = librosData.buscarLibrosPorNombre("Soledad");
//        for (Libros libro : librosPorNombre) {
//            System.out.println("Libro encontrado por nombre: " + libro.getTitulo());
//        }
//
//------------------------------------------------------------------------------------------------------------------------------  
//        // Prueba del método buscarLibrosPorAutor
//        List<Libros> librosPorAutor = librosData.buscarLibrosPorAutor("marquez");
//        for (Libros libro : librosPorAutor) {
//            System.out.println("Libro encontrado por autor: " + libro.getTitulo());
//        }
//
//------------------------------------------------------------------------------------------------------------------------------  
//        // Prueba del método listarLibros
//        List<Libros> listaLibros = librosData.listarLibros();
//        for (Libros libro : listaLibros) {
//            System.out.println("Datos del libro:");
//            System.out.println("ID Del Libro: " + libro.getIdLibro()) ;
//            System.out.println("Título: " + libro.getTitulo());
//            System.out.println("Autor: " + libro.getAutor());
//            System.out.println("ISBN: " + libro.getIsbn());
//            System.out.println("Género: " + libro.getGenero());
//            System.out.println("Año de Publicación: " + libro.getAnioPublicacion());
//            System.out.println("Estado: " + libro.getEstado());
//            System.out.println("--------------------------------------");
//        }
//
//------------------------------------------------------------------------------------------------------------------------------    
//------------------------------------------------PRUEBA METODOS USUARIOS DATA!!!!!!--------------------------------------------
//        // Crear un nuevo usuario -------------------------FUNCA
//
//        Usuarios nuevoUsuario = new Usuarios("Romina", "Coria", 1234, "romi.coria@gmail.com", "123", true);
//        usuariosData.guardarUsuario(nuevoUsuario);
//
//------------------------------------------------------------------------------------------------------------------------------    
//        // Buscar un usuario por su ID -------------------------FUNCA
//        int idUsuarioBuscado = 1;
//        Usuarios usuarioEncontrado = usuariosData.buscarUsuarioPorId(idUsuarioBuscado);
//        System.out.println("Usuario encontrado por ID:");
//        System.out.println(usuarioEncontrado);
//
//------------------------------------------------------------------------------------------------------------------------------    
        // Modificar el usuario encontrado -------------------------FUNCA
//        int idUsuarioBuscado = 1; // Supongamos que quieres modificar el usuario con ID 1
//        Usuarios usuarioEncontrado = usuariosData.buscarUsuarioPorId(idUsuarioBuscado);
//
//        if (usuarioEncontrado != null) {
//            // Modificar los atributos del usuario
//            usuarioEncontrado.setNombre("Juan"); // Cambiar el nombre a "Juan"
//            usuarioEncontrado.setApellido("López"); // Cambiar el apellido a "López"
//            usuarioEncontrado.setDni(321654987); // Cambiar el DNI a 321654987
//            usuarioEncontrado.setEmail("juan.lopez@example.com"); // Cambiar el email
//            usuarioEncontrado.setContrasenia("1111"); // Cambiar la contraseña
//            usuarioEncontrado.setEstado(true); // Cambiar el estado del usuario
//
//            // Llamar al método para modificar el usuario
//            usuariosData.modificarUsuario(usuarioEncontrado);
//
//            System.out.println("Usuario modificado exitosamente.");
//        } else {
//            System.out.println("No se encontró un usuario con el ID especificado.");
//        }
//
//------------------------------------------------------------------------------------------------------------------------------    
//        // Cambiar el estado de un usuario por su ID -------------------------FUNCA
//        int idUsuarioEstado = 1;
//        usuariosData.cambiarEstadoUsuario(idUsuarioEstado, false);
//        System.out.println("Estado del usuario cambiado exitosamente.");
//
//------------------------------------------------------------------------------------------------------------------------------    
//         // Buscar un usuario por su DNI -------------------------FUNCA
//        int dniUsuarioBuscado = 321654987;
//        Usuarios usuarioPorDNI = usuariosData.buscarUsuarioPorDNI(dniUsuarioBuscado);
//        System.out.println("Usuario encontrado por DNI:");
//        System.out.println(usuarioPorDNI);
//          
//------------------------------------------------------------------------------------------------------------------------------    
// Buscar un usuario por su ID -------------------------FUNCA
//        // ID del usuario que deseas buscar
//        int idUsuarioBuscado = 1; // Supongamos que queremos buscar el usuario con ID 1
//
//        // Llamar al método buscarUsuarioPorId
//        Usuarios usuarioEncontrado = usuariosData.buscarUsuarioPorId(idUsuarioBuscado);
//
//        // Verificar si se encontró un usuario con el ID especificado
//        if (usuarioEncontrado != null) {
//            System.out.println("Usuario encontrado por ID:");
//            System.out.println(usuarioEncontrado);
//        } else {
//            System.out.println("No se encontró un usuario con el ID especificado.");
//        } 
//
//------------------------------------------------------------------------------------------------------------------------------  
//      //Buscar usuarios por su Nombre en la base de datos.
//        String nombreUsuario = "romina"; // Reemplaza por el nombre real que deseas buscar
//
//        // Llamar al método buscarUsuarioPorNombre y obtener el resultado
//        Usuarios usuarioEncontrado = usuariosData.buscarUsuarioPorNombre(nombreUsuario);
//
//        // Verificar si se encontró un usuario con el nombre proporcionado
//        if (usuarioEncontrado != null) {
//            System.out.println("Usuario encontrado:");
//            System.out.println(usuarioEncontrado); // Esto imprimirá la información del usuario encontrado
//        } else {
//            System.out.println("No se encontró un usuario con el nombre especificado.");
//        }
//
//------------------------------------------------------------------------------------------------------------------------------        
//------------------------------------------------PRUEBA METODOS MULTAS DATA!!!!!!----------------------------------------------    
//        // Crear un objeto de prueba de la clase Multas -------------------------FUNCA
//        
//        Multas multaPrueba = new Multas();
//        multaPrueba.setIdUsuarioMultado(2);
//        multaPrueba.setMontoQueDebe(1000);
//        multaPrueba.setFechaDeMulta(LocalDate.now());
//        multaPrueba.setEstadoDelPago(false);
//        multaPrueba.setDniUsuario("1234");
//       multasData.guardarMulta(multaPrueba);
//
//------------------------------------------------------------------------------------------------------------------------------           
//            // Modificar la multa en la base de datos -------------------------FUNCA
//            
//    // Crear un objeto Multas con los datos de la multa que deseas modificar
//    Multas multaModificar = new Multas();
//    multaModificar.setIdUnicoDeLaMulta(2); // ID de la multa que deseas modificar
//    multaModificar.setIdUsuarioMultado(2); // ID del usuario multado existente en la base de datos
//    multaModificar.setMontoQueDebe(1000); // Monto que debe
//    multaModificar.setFechaDeMulta(LocalDate.of(2355, 2, 5));
//    multaModificar.setEstadoDelPago(true); // Estado del pago
//    multaModificar.setDniUsuario("1234"); // DNI del usuario
//
//    // Llamar al método para modificar la multa en la base de datos
//    multasData.modificarMulta(multaModificar);
//
//------------------------------------------------------------------------------------------------------------------------------    
//            // Buscar multas por DNI -------------------------FUNCA
//
//            List<Multas> multasPorDNI = multasData.buscarMultasPorDNI("1234");
//            System.out.println("Multas encontradas por DNI:");
//            for (Multas multa : multasPorDNI) {
//                System.out.println(multa);
//            }
//------------------------------------------------------------------------------------------------------------------------------    
//            // Buscar multas por ID de usuario -------------------------FUNCA
//            List<Multas> multasPorIDUsuario = multasData.buscarMultasPorIDUsuario(1);
//            System.out.println("Multas encontradas por ID de usuario:");
//            for (Multas multa : multasPorIDUsuario) {
//                System.out.println(multa);
//            }
//
//------------------------------------------------------------------------------------------------------------------------------        
//         //  Obtener todas las multas de la base de datos -------------------------FUNCA
//        List<Multas> todasLasMultas = multasData.obtenerTodasLasMultas();
//        System.out.println("Todas las multas:");
//        for (Multas multa : todasLasMultas) {
//            System.out.println(multa);
//        }
//
//------------------------------------------------------------------------------------------------------------------------------    
//        // Eliminar la multa de prueba -------------------------FUNCA
//        MultasData multita = new MultasData();
//        multita.eliminarMulta(2);
//
//------------------------------------------------------------------------------------------------------------------------------             
//------------------------------------------------PRUEBA METODOS PRESTAMOS DATA!!!!!!-------------------------------------------    
//        // Guardar nuevo prestamo:
//        prestamo.setIdLibroPresta(2); // ID del Libro que se presta
//        prestamo.setIdUsuarioPresta(1); // ID del usuario al que se presta
//        prestamo.setFechaDelPrestamo(LocalDate.of(2002, 12, 10)); // Fecha del préstamo
//        prestamo.setFechaDeDevolucion(LocalDate.of(2003, 1, 20)); // Fecha de devolución
//        prestamo.setEstadoDelPrestamo(true); // Estado del préstamo
//
//        prestamosData.agregarPrestamo(prestamo); // Llamar al método para agregar el préstamo
//      
//      // Guardar nuevo prestamo peeeeeeero con fecha de devoluvion VACIA O SEA NULL:
//
//        prestamo.setIdLibroPresta(2); // ID del Libro que se presta
//        prestamo.setIdUsuarioPresta(1); // ID del usuario al que se presta
//        prestamo.setFechaDelPrestamo(LocalDate.of(2002, 12, 10)); // Fecha del préstamo
//        // No establecer la fecha de devolución, lo que indica que es NULL en la base de datos
//        prestamo.setEstadoDelPrestamo(true); // Estado del préstamo
//
//        prestamosData.agregarPrestamo(prestamo); // Llamar al método para agregar el préstamo
//
//------------------------------------------------------------------------------------------------------------------------------           
//        //lista de todos los Prestamos:
//        List<Prestamos> listaPrestamos = prestamosData.obtenerPrestamos();
//
//        for (Prestamos p : listaPrestamos) {
//            System.out.println(p.toString());
//        }
//
//------------------------------------------------------------------------------------------------------------------------------    
//        //Actualizar un préstamo:
//        prestamo.setIdUnicoDelPrestamo(1); // Supongamos que el préstamo a modificar tiene ID 1
//        prestamo.setIdLibroPresta(2); // Nuevos valores
//        prestamo.setIdUsuarioPresta(2);
//        prestamo.setFechaDelPrestamo(LocalDate.now());
//        prestamo.setFechaDeDevolucion(LocalDate.now().plusDays(14));
//        prestamo.setEstadoDelPrestamo(false);
//          
//        prestamosData.modificarPrestamo(prestamo);
//          
//------------------------------------------------------------------------------------------------------------------------------    
//        //Eliminar un préstamo:       
//        int idPrestamoEliminar = 1; // El prestamo a eliminar tiene ID 1
//              
//        prestamosData.eliminarPrestamo(idPrestamoEliminar, false);
//          
//------------------------------------------------------------------------------------------------------------------------------    
//------------------------------------------------------------------------------------------------------------------------------  

    }

}
