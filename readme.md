1.采用Arouter组件化，AS建议安装ARouter Helper，可以快速导航
2.App是主app。app_file和app_settings 等是可以单独编译apk或者编入主app的组件。以后新建此类组件，需要以app开头，资源命令需要约束。
3.以fun开头，是功能模块，单纯的提供功能支持，资源命名需要约束。
4.lib开头的，是基础库。