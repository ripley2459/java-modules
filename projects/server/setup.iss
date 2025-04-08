
#define MyAppName "Server"
#define MyAppPublisher "Cyril Neveu"
#define MyAppURL "https://cyrilneveu.fr/"
#define MyAppExeName "Server.bat"
;#define MyAppAssocName MyAppName + " File"
#define MyAppId "{f7d9aeff-d10e-4dd4-9138-3f63806e41c5}"
;#define MyAppAssocExt ".bat"
;#define MyAppAssocKey StringChange(MyAppAssocName, " ", "") + MyAppAssocExt

[Setup]
AppId={#StringChange(MyAppId, '{', '{{')}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}

AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppURL}
AppSupportURL={#MyAppURL}
AppUpdatesURL={#MyAppURL}
DefaultDirName=C:/{#MyAppName}
DefaultGroupName={#MyAppName}

OutputDir=..\..\dist\{#MyAppName}
OutputBaseFilename={#MyAppName}_{#MyAppVersion}_{#MyTimestamp}_installer
Compression=zip
SolidCompression=yes
LZMAUseSeparateProcess=yes
LZMANumBlockThreads=6
WizardStyle=modern

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "{#MyAppExeName}"; DestDir: "{app}"; Flags: ignoreversion
Source: "build\libs\{#MyAppName}-{#MyAppVersion}.jar"; DestDir: "{app}"; DestName: "{#MyAppName}.jar"; Flags: ignoreversion
Source: "build\libs\jre\*"; DestDir: "{app}\jre"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "..\..\natives\vtk\*"; DestDir: "{app}\natives\vtk\"; Flags: ignoreversion

[Icons]
Name: "{autoprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: nowait postinstall skipifsilent