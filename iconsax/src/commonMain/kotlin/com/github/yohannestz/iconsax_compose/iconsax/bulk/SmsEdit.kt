package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SmsEdit: ImageVector
    get() {
        val current = _smsEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SmsEdit",
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
                moveTo(x = 7.0f, y = 3.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.5f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 3.14f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.42f, dy1 = 0.9f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.66f, dy1 = -0.45f)
                arcToRelative(a = 6.54f, b = 6.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.36f, dy1 = 7.31f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.99f, dy1 = 1.11f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.5f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -7.0f)
                curveTo(x1 = 2.0f, y1 = 4.5f, x2 = 4.0f, y2 = 3.0f, x3 = 7.0f, y3 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 11.87f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.34f, dy1 = -0.79f)
                lineToRelative(dx = -3.13f, dy = -2.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.93f, dy1 = -1.17f)
                lineToRelative(dx = 3.13f, dy = 2.5f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.81f, dy1 = 0.0f)
                lineToRelative(dx = 3.13f, dy = -2.5f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 0.12f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.12f, dy1 = 1.05f)
                lineToRelative(dx = -3.13f, dy = 2.5f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.33f, dy1 = 0.8f)
                moveTo(x = 18.0f, y = 13.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 10.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -10.0f)
                moveToRelative(dx = 2.05f, dy = 4.55f)
                lineToRelative(dx = -0.37f, dy = 0.36f)
                lineToRelative(dx = -2.17f, dy = 2.18f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.43f, dy1 = 0.21f)
                lineToRelative(dx = -0.98f, dy = 0.14f)
                curveToRelative(dx1 = -0.35f, dy1 = 0.05f, dx2 = -0.6f, dy2 = -0.2f, dx3 = -0.55f, dy3 = -0.55f)
                lineToRelative(dx = 0.14f, dy = -0.98f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = -0.43f)
                lineToRelative(dx = 2.18f, dy = -2.17f)
                lineToRelative(dx = 0.36f, dy = -0.37f)
                curveToRelative(dx1 = 0.24f, dy1 = -0.24f, dx2 = 0.51f, dy2 = -0.4f, dx3 = 0.79f, dy3 = -0.4f)
                quadToRelative(dx1 = 0.36f, dy1 = -0.02f, dx2 = 0.81f, dy2 = 0.4f)
                curveToRelative(dx1 = 0.66f, dy1 = 0.66f, dx2 = 0.45f, dy2 = 1.17f, dx3 = 0.01f, dy3 = 1.61f)
            }
        }.build().also { _smsEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _smsEdit: ImageVector? = null
