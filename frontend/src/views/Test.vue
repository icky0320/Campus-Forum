<template>
  <div :class="theme">
    <el-button @click="toggleTheme">切换主题</el-button>
    <!-- 其他组件内容 -->
  </div>
</template>

<script>
export default {
  data() {
    return {
      theme: 'light' // 默认主题
    };
  },
  methods: {
    toggleTheme() {
      this.theme = this.theme === 'light' ? 'dark' : 'light';
      this.applyTheme();
    },
    applyTheme() {
      document.body.className = this.theme; // 更新 body 的类名
    }
  },
  mounted() {
    this.applyTheme(); // 初始化主题
  }
};
</script>

<style>
.light {
  background-color: #ffffff;
  color: #000000;
}

.dark {
  background-color: #2c2c2c;
  color: #ffffff;
}

/* 其他样式 */
</style>
