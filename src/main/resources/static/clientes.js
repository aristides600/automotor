// Función para cargar clientes desde la API ficticia
function cargarClientes() {
    fetch("/api/clientes") // Reemplaza la URL con la de tu servidor backend
        .then(response => response.json())
        .then(clientes => {
            const clienteList = document.getElementById("cliente-list");
            clienteList.innerHTML = "";
            clientes.forEach(cliente => {
                const row = clienteList.insertRow();
                row.insertCell().textContent = cliente.cli_dni;
                row.insertCell().textContent = cliente.cli_apellido;
                row.insertCell().textContent = cliente.cli_nombre;
                row.insertCell().textContent = cliente.cli_mail;
                row.insertCell().textContent = cliente.cli_domicilio;
                row.insertCell().textContent = cliente.cli_fechanac;
                row.insertCell().textContent = cliente.cli_cp;
                row.insertCell().textContent = cliente.contribuyente_id;
                const accionesCell = row.insertCell();
                accionesCell.innerHTML = `
                    <button class="btn btn-info btn-sm" data-toggle="modal" data-target="#clienteModal" onclick="editarCliente('${cliente.dni}')">Editar</button>
                    <button class="btn btn-danger btn-sm" onclick="eliminarCliente('${cliente.dni}')">Eliminar</button>
                `;
            });
        });
}

// Función para cargar vehículos desde la API ficticia
function cargarVehiculos() {
    fetch("/api/vehiculos") // Reemplaza la URL con la de tu servidor backend
        .then(response => response.json())
        .then(vehiculos => {
            const vehiculoList = document.getElementById("vehiculo-list");
            vehiculoList.innerHTML = "";
            vehiculos.forEach(vehiculo => {
                const row = vehiculoList.insertRow();
                row.insertCell().textContent = vehiculo.marca;
                row.insertCell().textContent = vehiculo.modelo;
                row.insertCell().textContent = vehiculo.color;
                row.insertCell().textContent = vehiculo.anio;
                row.insertCell().textContent = vehiculo.carroceria;
                row.insertCell().textContent = vehiculo.motor;
                const accionesCell = row.insertCell();
                accionesCell.innerHTML = `
                    <button class="btn btn-info btn-sm" data-toggle="modal" data-target="#vehiculoModal" onclick="editarVehiculo('${vehiculo.id}')">Editar</button>
                    <button class="btn btn-danger btn-sm" onclick="eliminarVehiculo('${vehiculo.id}')">Eliminar</button>
                `;
            });
        });
}

// Otras funciones como editarCliente, eliminarCliente, editarVehiculo, eliminarVehiculo se pueden agregar aquí

// Llama a cargarClientes y cargarVehiculos al cargar la página
cargarClientes();
cargarVehiculos();
