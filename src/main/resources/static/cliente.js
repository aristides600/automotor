const app = Vue.createApp({
    data() {
        return {
            cliente: {
                dni: '',
                apellido: '',
                nombre: '',
                domicilio: '',
                email: '',
                fechaAlta: '',
                fechaNacimiento: '',
                estado: '',
                localidad: '',
                usuario: '',
                contribuyente: '',
            },
            clientes: [], // Aquí se almacenarán los clientes obtenidos de la API
        };
    },
    mounted() {
        // Obtener la fecha actual y formatearla como "YYYY-MM-DD"
        const fechaHoy = new Date();
        const año = fechaHoy.getFullYear();
        const mes = String(fechaHoy.getMonth() + 1).padStart(2, '0');
        const día = String(fechaHoy.getDate()).padStart(2, '0');
        this.fechaAlta = `${año}-${mes}-${día}`;
    },
    methods: {
        async cargarClientes() {
            try {
                // Realizar la petición GET a la API para obtener la lista de clientes
                const response = await fetch('/api/clientes');
                if (!response.ok) {
                    throw new Error('Error al obtener los clientes');
                }
                this.clientes = await response.json();
            } catch (error) {
                console.error('Error:', error);
            }
        },
        async guardarCliente() {
            try {
                // Realizar la petición POST o PUT a la API para guardar o actualizar el cliente
                const response = await fetch("/api/clientes", {
                    method: "POST", // Cambia a "PUT" si es una actualización
                    headers: {
                        "Content-Type": "application/json",
                    },
                    body: JSON.stringify(this.cliente),
                });
                if (!response.ok) {
                    throw new Error('Error al guardar el cliente');
                }

                // Limpiar el formulario después de guardar
                this.cliente = {
                    dni: '',
                    apellido: '',
                    nombre: '',
                    domicilio: '',
                    email: '',
                    fechaAlta: '',
                    fechaNacimiento: '',
                    estado: '',
                    localidad: '',
                    usuario: '',
                    contribuyente: '',
                };

                // Recargar la lista de clientes
                this.cargarClientes();
            } catch (error) {
                console.error('Error:', error);
            }
        },
        async eliminarCliente(clienteId) {
            if (confirm("¿Desea eliminar este cliente?")) {
                try {
                    // Realizar la petición DELETE a la API para eliminar el cliente
                    const response = await fetch(`/api/clientes/${clienteId}`, {
                        method: "DELETE",
                    });
                    if (!response.ok) {
                        throw new Error('Error al eliminar el cliente');
                    }

                    // Recargar la lista de clientes
                    this.cargarClientes();
                } catch (error) {
                    console.error('Error:', error);
                }
            }
        },
        editarCliente(cliente) {
            // Llenar el formulario con los datos del cliente para editar
            this.cliente = { ...cliente };
        },
    },
    created() {
        // Cargar la lista de clientes al cargar la página
        this.cargarClientes();
    },
});

app.mount('#app');