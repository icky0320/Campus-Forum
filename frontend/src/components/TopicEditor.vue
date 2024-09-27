<script setup>
import {Check, Document} from "@element-plus/icons-vue";
import {reactive} from "vue";
import {QuillEditor} from "@vueup/vue-quill";
import '@vueup/vue-quill/dist/vue-quill.snow.css'

defineProps({
    show: Boolean
})

const emit = defineEmits(['close'])

const editor = reactive({
    type: null,
    title: '',
    text: ''
})
const types = [
    {id: 1, name: '日常闲聊', desc: '在这里分享你的各种日常'},
    {id: 2, name: '真诚交友', desc: '在校园里寻找与自己志同道合的朋友'},
    {id: 3, name: '问题反馈', desc: '反馈你在校园里遇到的问题'},
    {id: 4, name: '恋爱官宣', desc: '向大家展示你的恋爱成果'},
    {id: 5, name: '踩坑记录', desc: '将你遇到的坑分享给大家，防止其他人再次入坑'}
]
</script>

<template>
    <div>
        <el-drawer :model-value="show"
                   direction="btt"
                   :close-on-click-modal="false"
                   :size="650"
                   @close="emit('close')">
            <template #header>
                <div>
                    <div style="font-weight: bold">发表新的帖子</div>
                    <div style="font-size: 13px">发表内容之前，请遵纪守法，不要骂人</div>
                </div>
            </template>
            <div style="display: flex;gap: 10px">
                <div style="width: 150px;">
                    <el-select v-model="editor.type" placeholder="选择主题类型...">
                        <el-option v-for="item in types" :value="item.id" :label="item.name"/>
                    </el-select>
                </div>
                <div style="flex: 1">
                    <el-input v-model="editor.title" placeholder="请输入帖子标题..." :prefix-icon="Document"
                                style="height: 100%;"/>
                </div>
            </div>
            <div style="margin-top: 15px;height: 460px;overflow: hidden">
                <quill-editor v-model:content="editor.text" style="height: calc(100% - 45px)"
                              placeholder="今天想分享点什么呢..?"/>
            </div>
            <div style="display: flex;justify-content: space-between;margin-top: 10px">
                <div style="color: grey;font-size: 13px">
                    当前字数200（最大支持2w字）
                </div>
                <div>
                    <el-button type="success" :icon="Check" plain>立即发表主题</el-button>
                </div>
            </div>
        </el-drawer>
    </div>
</template>

<style scoped>
:deep(.el-drawer){
    width: 800px;
    margin: auto;
    border-radius: 10px 10px 0 0;

}
:deep(.el-drawer__header){
    margin: 0;
}
:deep(.el-drawer__header){
    margin: 0;
}
:deep(.el-drawer__header){
    margin: 0;
}
:deep(.ql-editor.ql-blank::before){
    color: var(--el-text-color-placeholder);
    font-style: normal;
}
:deep(.ql-editor){
    font-size: 14px;
}
</style>