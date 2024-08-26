<template>
  <header><Header/></header>
  <main>
    <router-view/>
  </main>
  <footer>
    <Footer/>
  </footer>
</template>

<script setup>

  import Header from "../src/components/Header.vue";
  import Footer from "../src/components/Footer.vue";
  import {RouterLink, RouterView} from "vue-router";

</script>


<style scoped>
 a {
  text-decoration: none;
 }
</style>
