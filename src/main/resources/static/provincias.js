Vue.createApp({
    data() {
        return {
            pro_nombre : "",
        }
    },
    methods: {
        async submitForm() {

            const provincia = {
                pro_nombre : this.pro_nombre
            }
            try {
                const response = await fetch('/api/provincias', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(provincia) 
                });
                if (response.ok) {
                    alert("Localidad creada exitosamente.");
                }
            } catch (error) {
                console.error('Error de red:', error);
            }
            
        }        
    }
}).mount('#app');
