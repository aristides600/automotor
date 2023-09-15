new Vue({
    el: "#app",
    data: {
        repuestos: [], // Almacena la lista de repuestos
        repuesto: { // Almacena el repuesto actual en el formulario
            codigo: "",
            nombre: "",
            precio: 0,
            stock: 0,
            marcaId: 0
        }
    },
    methods: {
        // Método para cargar la lista de repuestos desde la API
        cargarRepuestos() {
            fetch("/api/repuestos")
                .then(response => response.json())
                .then(data => {
                    this.repuestos = data;
                })
                .catch(error => {
                    console.error("Error al cargar los repuestos:", error);
                });
        },
        // Método para guardar un repuesto
        guardarRepuesto() {
            const repuestoData = {
                codigo: this.repuesto.codigo,
                nombre: this.repuesto.nombre,
                precio: this.repuesto.precio,
                stock: this.repuesto.stock,
                marcaId: this.repuesto.marcaId
            };

            // Realiza la petición POST para guardar el repuesto
            fetch("/api/repuestos", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(repuestoData)
            })
            .then(response => response.json())
            .then(data => {
                // Agrega el repuesto a la lista
                this.repuestos.push(data);
                // Limpia el formulario
                this.repuesto = {
                    codigo: "",
                    nombre: "",
                    precio: 0,
                    stock: 0,
                    marcaId: 0
                };
            })
            .catch(error => {
                console.error("Error al guardar el repuesto:", error);
            });
        },
        // Método para editar un repuesto
        editarRepuesto(repuesto) {
            // Carga los datos del repuesto en el formulario para edición
            this.repuesto = { ...repuesto }; // Copia los datos para evitar cambios directos en el objeto original
        },
        // Método para eliminar un repuesto
        eliminarRepuesto(repuestoId) {
            // Realiza la petición DELETE para eliminar el repuesto
            fetch(`/api/repuestos/${repuestoId}`, {
                method: "DELETE"
            })
            .then(() => {
                // Elimina el repuesto de la lista
                this.repuestos = this.repuestos.filter(repuesto => repuesto.id !== repuestoId);
                // Limpia el formulario
                this.repuesto = {
                    codigo: "",
                    nombre: "",
                    precio: 0,
                    stock: 0,
                    marcaId: 0
                };
            })
            .catch(error => {
                console.error("Error al eliminar el repuesto:", error);
            });
        }
    },
    created() {
        // Carga la lista de repuestos al iniciar la página
        this.cargarRepuestos();
    }
});
