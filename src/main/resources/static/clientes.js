const app = Vue.createApp({
    data() {
        return {
            clientes: [],
        };
    },
    methods: {
        async cargarClientes() {
            try {
                const response = await fetch("/api/clientes");
                if (!response.ok) {
                    throw new Error('Error al obtener los servicios de decoración');
                }
                this.clientes = await response.json();
                console.log(this.clientes);
            } catch (error) {
                console.error('Error:', error);
            }
        },
        // eliminarServicio(id) {
        //     if (confirm("¿Desea eliminar este servicio de decoración?")) {
        //         fetch(`/admin/servicios/${id}`, {
        //             method: "DELETE"
        //         }).then(() => {
        //             location.reload();
        //         });
        //     }
        // },
    },
    mounted() {
        this.cargarClientes();
    }
});

app.mount('#app');