document.addEventListener("DOMContentLoaded", function () {
    const repuestosTable = document.getElementById("repuestos-table");

    // Función para cargar los repuestos desde la API ficticia
    function cargarRepuestos() {
        // Realiza una solicitud GET a la API para obtener la lista de repuestos
        // Reemplaza la URL con la de tu servidor backend
        fetch("/api/repuestos")
            .then(response => response.json())
            .then(repuestos => {
                repuestosTable.innerHTML = ""; // Limpia la tabla antes de agregar nuevos datos
                repuestos.forEach(repuesto => {
                    const row = repuestosTable.insertRow();
                    row.innerHTML = `
                        //<td>${repuesto.res_id}</td>//
                        <td>${repuesto.res_codigo}</td>
                        <td>${repuesto.res_nombre}</td>
                        <td>${repuesto.res_precio}</td>
                        <td>${repuesto.res_stock}</td>
                        <td>${repuesto.marcarepuesto_id}</td>
                        <td>
                            <button class="btn btn-info btn-sm" data-toggle="modal" data-target="#editarModal" onclick="editarRepuesto(${repuesto.id})">Editar</button>
                            <button class="btn btn-danger btn-sm" data-toggle="modal" data-target="#eliminarModal" onclick="eliminarRepuesto(${repuesto.id})">Eliminar</button>
                        </td>
                    `;
                });
            })
            .catch(error => {
                console.error("Error al cargar repuestos:", error);
            });
    }

    // Llama a la función para cargar los repuestos al cargar la página
    cargarRepuestos();
});
