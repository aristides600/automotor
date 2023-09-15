new Vue({
    el: "#app",
    data: {
        clientes: [], // Aquí se almacenarán los clientes obtenidos de la API
        clienteActual: null
    },
    created() {
        // Cuando se crea la instancia de Vue, obtén la lista de clientes desde la API
        // Reemplaza la URL con la dirección de tu API
        fetch("/api/clientes")
            .then(response => response.json())
            .then(data => {
                this.clientes = data;
            })
            .catch(error => {
                console.error("Error al obtener la lista de clientes:", error);
            });
    },
    methods: {
        nuevoCliente() {
            // Lógica para abrir el modal de agregar cliente
            // Puedes definir la lógica para agregar un nuevo cliente aquí
        },
        editarCliente(cliente) {
            // Lógica para abrir el modal de editar cliente y cargar los datos del cliente seleccionado
            this.clienteActual = cliente;
            // Puedes definir la lógica para editar un cliente aquí
        },
        eliminarCliente(cliente) {
            // Lógica para eliminar un cliente (puedes confirmar antes de eliminar)
            // Puedes definir la lógica para eliminar un cliente aquí
        }
    }
});
