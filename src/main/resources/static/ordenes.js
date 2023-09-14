// Función para cargar órdenes de trabajo desde la API ficticia
function cargarOrdenes() {
    fetch("/api/ordenes") // Reemplaza la URL con la de tu servidor backend
        .then(response => response.json())
        .then(ordenes => {
            const ordenList = document.getElementById("orden-list");
            ordenList.innerHTML = "";
            ordenes.forEach(orden => {
                const row = ordenList.insertRow();
                row.insertCell().textContent = orden.ord_id;
                row.insertCell().textContent = orden.ord_ingreso;
                row.insertCell().textContent = orden.ord_egreso;
                row.insertCell().textContent = orden.ord_problema;
                row.insertCell().textContent = orden.ord_diagnostico;
                row.insertCell().textContent = orden.ord_importemdo;
                row.insertCell().textContent = orden.ordimporteres;
                row.insertCell().textContent = orden.km;
                row.insertCell().textContent = orden.mecanico_id;
                row.insertCell().textContent = orden.tipo_id;
                row.insertCell().textContent = orden.usuario_id;
                row.insertCell().textContent = orden.vehiculo_id;
                row.insertCell().textContent = orden.ord_estado;
                const accionesCell = row.insertCell();
                accionesCell.innerHTML = `
                    <button class="btn btn-info btn-sm" data-toggle="modal" data-target="#ordenModal" onclick="editarOrden(${orden.id})">Editar</button>
                    <button class="btn btn-danger btn-sm" onclick="eliminarOrden(${orden.id})">Eliminar</button>
                `;
            });
        });
}

// Función para crear o actualizar una orden de trabajo
function guardarOrden() {
    // Lógica para guardar una orden de trabajo
}

// Función para editar una orden de trabajo
function editarOrden(id) {
    // Lógica para cargar los datos de una orden y abrir el modal de edición
}

// Función para eliminar una orden de trabajo
function eliminarOrden(id) {
    // Lógica para eliminar una orden de trabajo
}

// Cargar órdenes de trabajo al cargar la página
cargarOrdenes();
