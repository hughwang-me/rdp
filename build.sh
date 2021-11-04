mvn -B clean package -Dmaven.test.skip=true -Dautoconfig.skip

# -Dmaven.repo.local=[仓库位置]
# 使用-U参数： 该参数能强制让Maven检查所有SNAPSHOT依赖更新，确保集成基于最新的状态，如果没有该参数，Maven默认以天为单位检查更新，而持续集成的频率应该比这高很多。
# 使用-B参数：该参数表示让Maven使用批处理模式构建项目，能够避免一些需要人工参与交互而造成的挂起状态。
# 使用-e参数：如果构建出现异常，该参数能让Maven打印完整的stack trace，以方便分析错误原因。