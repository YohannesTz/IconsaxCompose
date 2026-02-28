package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectSend: ImageVector
    get() {
        val current = _directSend
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectSend",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.53f, y = 3.47f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                lineToRelative(dx = -0.02f, dy = -0.02f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = -0.15f)
                lineToRelative(dx = -0.02f, dy = -0.01f)
                quadToRelative(dx1 = -0.12f, dy1 = -0.04f, dx2 = -0.24f, dy2 = -0.05f)
                horizontalLineToRelative(dx = -0.08f)
                quadToRelative(dx1 = -0.09f, dy1 = 0.0f, dx2 = -0.18f, dy2 = 0.04f)
                quadToRelative(dx1 = -0.04f, dy1 = 0.0f, dx2 = -0.07f, dy2 = 0.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = 0.15f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.72f, dy = -0.72f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 9.4f, x2 = 12.75f, y2 = 9.0f)
                verticalLineTo(y = 3.8f)
                lineToRelative(dx = 0.72f, dy = 0.73f)
                quadTo(x1 = 13.7f, y1 = 4.75f, x2 = 14.0f, y2 = 4.75f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 6.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 6.0f, x2 = 2.0f, y2 = 8.17f, x3 = 2.0f, y3 = 11.81f)
                verticalLineToRelative(dy = 4.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineToRelative(dy = -4.37f)
                curveTo(x1 = 22.0f, y1 = 8.17f, x2 = 19.83f, y2 = 6.0f, x3 = 16.19f, y3 = 6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.3f, y = 12.23f)
                horizontalLineToRelative(dx = -3.48f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.29f, dy1 = 1.42f)
                lineToRelative(dx = -0.84f, dy = 1.66f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = 0.65f)
                horizontalLineToRelative(dx = -3.28f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = -0.65f)
                lineToRelative(dx = -0.84f, dy = -1.65f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.29f, dy1 = -1.42f)
                horizontalLineTo(x = 2.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.7f)
                verticalLineToRelative(dy = 3.26f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.18f, y2 = 22.0f, x3 = 7.82f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveToRelative(dx1 = 3.43f, dy1 = 0.0f, dx2 = 5.54f, dy2 = -1.88f, dx3 = 5.8f, dy3 = -5.22f)
                verticalLineToRelative(dy = -3.85f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -0.7f)
            }
        }.build().also { _directSend = it }
    }

@Suppress("ObjectPropertyName")
private var _directSend: ImageVector? = null
