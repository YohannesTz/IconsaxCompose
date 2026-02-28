package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cut: ImageVector
    get() {
        val current = _cut
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cut",
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
                moveTo(x = 16.2f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveToRelative(dx1 = -3.64f, dy1 = 0.0f, dx2 = -5.8f, dy2 = 2.17f, dx3 = -5.8f, dy3 = 5.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.16f, dy2 = 5.81f, dx3 = 5.8f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.2f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.17f, y = 12.0f)
                lineToRelative(dx = 3.6f, dy = -2.7f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = -1.2f)
                lineToRelative(dx = -3.95f, dy = 2.95f)
                lineToRelative(dx = -2.4f, dy = -1.8f)
                quadToRelative(dx1 = 0.02f, dy1 = -0.13f, dx2 = 0.03f, dy2 = -0.28f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -2.3f, dy1 = 2.3f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.6f, dy1 = -0.65f)
                lineTo(x = 11.68f, y = 12.0f)
                lineToRelative(dx = -1.84f, dy = 1.38f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.58f, dy1 = -0.64f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 2.3f, dy1 = 2.3f)
                lineToRelative(dx = -0.03f, dy = -0.3f)
                lineToRelative(dx = 2.41f, dy = -1.8f)
                lineToRelative(dx = 3.95f, dy = 2.95f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.45f, dy1 = 0.15f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.45f, dy1 = -1.35f)
                close()
            }
        }.build().also { _cut = it }
    }

@Suppress("ObjectPropertyName")
private var _cut: ImageVector? = null
