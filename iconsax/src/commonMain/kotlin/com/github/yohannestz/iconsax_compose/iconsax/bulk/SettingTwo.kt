package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SettingTwo: ImageVector
    get() {
        val current = _settingTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SettingTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 2.0f, y = 12.88f)
                verticalLineToRelative(dy = -1.76f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = -1.9f)
                curveToRelative(dx1 = 1.81f, dy1 = 0.0f, dx2 = 2.55f, dy2 = -1.28f, dx3 = 1.64f, dy3 = -2.85f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = -2.59f)
                lineTo(x = 7.97f, y = 2.8f)
                arcToRelative(a = 1.67f, b = 1.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.28f, dy1 = 0.6f)
                lineToRelative(dx = 0.11f, dy = 0.2f)
                curveToRelative(dx1 = 0.9f, dy1 = 1.56f, dx2 = 2.38f, dy2 = 1.56f, dx3 = 3.29f, dy3 = 0.0f)
                lineToRelative(dx = 0.11f, dy = -0.2f)
                arcToRelative(a = 1.67f, b = 1.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.28f, dy1 = -0.6f)
                lineToRelative(dx = 1.73f, dy = 1.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = 2.58f)
                curveToRelative(dx1 = -0.91f, dy1 = 1.57f, dx2 = -0.17f, dy2 = 2.85f, dx3 = 1.64f, dy3 = 2.85f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = 1.9f)
                verticalLineToRelative(dy = 1.76f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.9f, dy1 = 1.9f)
                curveToRelative(dx1 = -1.81f, dy1 = 0.0f, dx2 = -2.55f, dy2 = 1.28f, dx3 = -1.64f, dy3 = 2.85f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = 2.6f)
                lineToRelative(dx = -1.73f, dy = 0.98f)
                arcToRelative(a = 1.67f, b = 1.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.28f, dy1 = -0.6f)
                lineToRelative(dx = -0.11f, dy = -0.19f)
                curveToRelative(dx1 = -0.9f, dy1 = -1.57f, dx2 = -2.38f, dy2 = -1.57f, dx3 = -3.29f, dy3 = 0.0f)
                lineToRelative(dx = -0.11f, dy = 0.2f)
                arcToRelative(a = 1.67f, b = 1.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.28f, dy1 = 0.6f)
                lineToRelative(dx = -1.73f, dy = -1.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = -2.59f)
                curveToRelative(dx1 = 0.91f, dy1 = -1.57f, dx2 = 0.17f, dy2 = -2.85f, dx3 = -1.64f, dy3 = -2.85f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.9f, dy1 = -1.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.25f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
            }
        }.build().also { _settingTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _settingTwo: ImageVector? = null
