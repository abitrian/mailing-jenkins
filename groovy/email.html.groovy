<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="UTF-8">
  <title>Email</title>
</head>

<body style="margin: 0; padding: 0;">
  <table logopacing="0" style="width: 90%;border-collapse: collapse;">
    <thead style="background-color: #FFFFFF;">
      <tr>
        <td colspan="7" style="height: 32px;"></td>
      </tr>
      <tr>
        <td rowspan="2" colspan="1" style="padding-left: 10px;"></td>
        <td rowspan="2" colspan="2" style="padding: 0 0 10px 0;width: 156px;text-align: center;">
          <img alt="logo" src="https://raw.githubusercontent.com/abitrian/mailing-jenkins/master/img/logo.png">
        </td>
        <td colspan="3" style="font-family: Lato-Bold, Helvetica; font-size: 12px; color: #343B49; letter-spacing: 2px; line-height: 16px; text-transform: uppercase;">
          logo Workflow Tool
        </td>
      </tr>
      <tr>
        <td colspan="4" style="display:inline;letter-spacing:1px;font-weight:700;font-size:24px;line-height:30px;font-family:Lato-Bold,Helvetica;padding-right:24px">
          ${statusSuccess ? 'The job is done' : "The job couldn't be done"}
        </td>
      </tr>
      <tr>
        <td colspan="1" style="height: 10px; width: 30px"></td>
        <td colspan="2" style="height: 10px;"></td>
        <td colspan="3" style="height: 10px;"></td>
        <td colspan="1" style="height: 10px; width: 100px"></td>
      </tr>
    </thead>
    <tbody style="background-color: #F4F4F4;">
      <tr>
        <td colspan="1"></td>
        <td colspan="2" style="height: 24px;position: relative;">
        </td>
        <td colspan="4"></td>
      </tr>
      <!--TABLE1-->
      <tr>
        <td rowspan="3" colspan="1"></td>
        <td rowspan="3" colspan="2" style="text-align: center;">
          <img alt="jenkins" src="https://raw.githubusercontent.com/abitrian/mailing-jenkins/master/img/jenkins.png">
        </td>
        <td colspan="2" style="vertical-align: bottom;font-family: Georgia; font-weight: bold; font-size: 16px; color: #343B49; letter-spacing: 1px; line-height: 16px;">
          Jenkins
        </td>
        <td rowspan="3" colspan="2" style="padding-right: 24px;">
          <table logopacing="0" cellpadding="0" width="142px" style="text-align: center;">
            <tr>
              <td width="64px" height="142px">
                <a href="${jenkinsUrl}" style="text-decoration: none;border-radius: 50%;background-color: #ffffff;display: inline-block;height: 72px;width: 72px;line-height: 76px;text-align: center">
                  <img alt="arrow" style="" src="https://raw.githubusercontent.com/abitrian/mailing-jenkins/master/img/arrow.png">
                </a>
              </td>
            </tr>
          </table>
        </td>

      </tr>
      <tr>
        <td colspan="2" style="vertical-align: middle; font-family: Lato-Light, Helvetica; font-size: 24px; color: #343B49; letter-spacing: 1px; line-height: 30px;">
          ${jenkinsText}
        </td>
      </tr>
      <tr>
        <td colspan="2" style="vertical-align: baseline; font-family: Lato, Helvetica; font-size: 16px; color: ${statusSuccess ? '#00D06D' : '#FF0082'}; letter-spacing: 1px; line-height: 16px; font-weight:900; text-transform: capitalize;">
          ${statusSuccess ? 'successful' : 'failed'}
        </td>
      </tr>
      <!--TABLE1-->
      <tr>
        <td colspan="7" style="height: 32px;"></td>
      </tr>
      <!--TABLE2-->
      <tr style="background-color: #FFFFFF;${ hasArtifacts ? '' : 'display: none;' }">
        <td rowspan="2" colspan="1" style="background-color: #F4F4F4;"></td>
        <td rowspan="2" colspan="2" style="padding-left: 24px;text-align: center;">
          <img alt="files" src="https://raw.githubusercontent.com/abitrian/mailing-jenkins/master/img/download-files.png">
        </td>
        <td colspan="2" style="padding-top: 10px;vertical-align: bottom; font-family: Lato-Bold, Helvetica; font-size: 12px; color: #343B49; letter-spacing: 2px; line-height: 16px; text-transform: uppercase;">
          App files
        </td>
        <td rowspan="2" colspan="2" style="padding: 0 24px 0 0;border-collapse: collapse;background-color: #F4F4F4;${ statusSuccess ? 'padding: 0;' : 'display: none;' }">
          <table logopacing="0" cellpadding="0" width="142px" style="border-color: #FFFFFF;border-collapse: collapse;text-align: center;background-color: #FFFFFF;border-top-right-radius: 50%;">
            <tr>
              <td width="64px" height="142px">
                <a href="${downloadUrl}" style="padding: 28px 28px 28px 28px;text-decoration: none;border-radius: 50%;background-color: #224FBD;">
                  <img style="position:relative;margin: 4px 0px 0px 0px;" alt="arrow" src="https://raw.githubusercontent.com/abitrian/mailing-jenkins/master/img/arrow-white.png">
                </a>
              </td>
            </tr>
          </table>
        </td>
      </tr>
      <tr style="background-color: #FFFFFF;${ hasArtifacts ? '' : 'display: none;' }">
        <td colspan="2" style="padding-top: 15px;vertical-align: baseline;font-family: Lato-Light, Helvetica; font-size: 24px; color: #343B49; letter-spacing: 1px; line-height: 24px;">
          Ready to download &amp; install
        </td>
      </tr>
      <tr style="${ hasArtifacts ? '' : 'display: none;' }">
        <td colspan="7" style="height: 32px; border-bottom: solid #F4F4F4 1px;"></td>
      </tr>
      <!--TABLE2-->
    </tbody>
    <tfoot style="background-color: #F4F4F4;">
      <tr>
        <td colspan="2"></td>
        <td colspan="5" style="font-family: Lato-Bold, Helvetica; font-size: 10px; color: #AEAEAE; letter-spacing: 2px; line-height: 16px; margin-bottom: 0; text-transform: uppercase;">
          Provided by logo
        </td>
      </tr>
      <tr>
        <td colspan="2"></td>
        <td colspan="1" style="font-family: Lato-Light, Helvetica; color: #AEAEAE; letter-spacing: 1px; font-weight: normal; font-size: 12px; line-height: 20px; margin: 8px 0;">
          A <strong style="font-family: Lato-Bold, Helvetica; color: #343B49;">Medium</strong> Engine
        </td>
        <td colspan="4" style="text-align: right;padding-right: 67px;">
          <ul style="list-style-type: none; margin: 0; padding: 0;">
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Lato-Bold, Helvetica; padding-right: 24px;">
              <a href="" style="text-decoration: none; color: #343B49;">More</a>
            </li>
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Lato-Bold, Helvetica; padding-right: 24px;">
              <a href="" style="text-decoration: none; color: #343B49;">Support</a>
            </li>
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Lato-Bold, Helvetica;">
              <a href="" style="text-decoration: none; color: #343B49;">Contact</a>
            </li>
          </ul>
        </td>
      </tr>
      <tr>
        <td colspan="2"></td>
        <td colspan="5" style="margin: 6px;">
        </td>
      </tr>
    </tfoot>
  </table>
</body>

</html>
