<template>
  <div>
    <v-container fill-height align-center justify-center>
      <v-toolbar dense src="../assets/toolbar-background.jpg">
        <v-app-bar-nav-icon></v-app-bar-nav-icon>

        <v-toolbar-title>Title</v-toolbar-title>

        <v-spacer></v-spacer>

        <v-btn icon>
          <v-icon>mdi-magnify</v-icon>
        </v-btn>

        <v-btn icon>
          <v-icon>mdi-heart</v-icon>
        </v-btn>

        <v-btn icon>
          <v-icon>mdi-dots-vertical</v-icon>
        </v-btn>
      </v-toolbar>
    </v-container>
  </div>
</template>

<script>
export default {
  name: "Toolbar"
};
</script>

<style></style>