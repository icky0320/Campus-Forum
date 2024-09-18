<script setup>

</script>
<!--初始登录界面左侧-->
<template>
  <div style="width: 100vw;height: 100vh;overflow: hidden;display: flex">
    <div style="flex: 1">
      <el-image style="width: 100%;height: 100%" fit="cover"
                src="https://pic.netbian.com/uploads/allimg/240825/210153-172459091388b5.jpg"/>
    </div>
    <div class="welcome-title">
      <div style="font-size: 30px;font-weight: bold">欢迎来到刺客的论坛</div>
      <div style="margin-top: 10px">在这里，你可以发表你自己的观点，别人可以看到并与你互动</div>
    </div>
    <div class="right-card">
      <router-view v-slot="{Component}">
        <transition name="el-fade-in-linear"  mode="out-in">
          <component :is="Component"/>
        </transition>
      </router-view>
    </div>
    <div>

    </div>
  </div>
</template>

<style scoped>
.welcome-title {
  position: absolute;
  bottom: 30px;
  left: 30px;
  color: gold;
  text-shadow: 0 0 10px black;
}
.right-card {
  width: 400px;
  z-index: 1;
  background-color: var(--el-bg-color);
}
</style>