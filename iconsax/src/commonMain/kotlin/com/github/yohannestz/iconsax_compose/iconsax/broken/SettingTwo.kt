package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 12.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -6.0f, dy1 = 0.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.17f, dy1 = 2.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.88f, y = 20.58f)
                lineToRelative(dx = 1.09f, dy = 0.63f)
                arcToRelative(a = 1.67f, b = 1.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.28f, dy1 = -0.6f)
                lineToRelative(dx = 0.11f, dy = -0.19f)
                curveToRelative(dx1 = 0.9f, dy1 = -1.57f, dx2 = 2.38f, dy2 = -1.57f, dx3 = 3.29f, dy3 = 0.0f)
                lineToRelative(dx = 0.11f, dy = 0.19f)
                arcToRelative(a = 1.67f, b = 1.67f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.28f, dy1 = 0.6f)
                lineToRelative(dx = 1.73f, dy = -0.99f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = -2.59f)
                curveToRelative(dx1 = -0.91f, dy1 = -1.57f, dx2 = -0.17f, dy2 = -2.85f, dx3 = 1.64f, dy3 = -2.85f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.9f, dy1 = -1.9f)
                verticalLineToRelative(dy = -1.76f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.9f, dy1 = -1.9f)
                curveToRelative(dx1 = -1.01f, dy1 = 0.0f, dx2 = -1.69f, dy2 = -0.4f, dx3 = -1.93f, dy3 = -1.03f)
                curveToRelative(dx1 = -0.19f, dy1 = -0.49f, dx2 = -0.11f, dy2 = -1.13f, dx3 = 0.29f, dy3 = -1.82f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -2.59f)
                lineToRelative(dx = -0.81f, dy = -0.46f)
                moveToRelative(dx = -3.32f, dy = 0.26f)
                curveToRelative(dx1 = -0.9f, dy1 = 1.57f, dx2 = -2.38f, dy2 = 1.57f, dx3 = -3.29f, dy3 = 0.0f)
                lineTo(x = 10.24f, y = 3.4f)
                arcToRelative(a = 1.66f, b = 1.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.27f, dy1 = -0.6f)
                lineToRelative(dx = -1.73f, dy = 1.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 2.6f)
                curveTo(x1 = 6.45f, y1 = 7.93f, x2 = 5.71f, y2 = 9.21f, x3 = 3.9f, y3 = 9.21f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.9f, dy1 = 1.9f)
                verticalLineToRelative(dy = 1.76f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.9f, dy1 = 1.9f)
                curveToRelative(dx1 = 1.81f, dy1 = 0.0f, dx2 = 2.55f, dy2 = 1.28f, dx3 = 1.64f, dy3 = 2.85f)
            }
        }.build().also { _settingTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _settingTwo: ImageVector? = null
