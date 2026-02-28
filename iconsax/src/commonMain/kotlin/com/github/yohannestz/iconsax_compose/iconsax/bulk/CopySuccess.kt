package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CopySuccess: ImageVector
    get() {
        val current = _copySuccess
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CopySuccess",
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
                moveTo(x = 17.1f, y = 2.0f)
                horizontalLineToRelative(dx = -4.2f)
                curveTo(x1 = 9.45f, y1 = 2.0f, x2 = 8.05f, y2 = 3.37f, x3 = 8.01f, y3 = 6.75f)
                horizontalLineToRelative(dx = 3.09f)
                curveToRelative(dx1 = 4.2f, dy1 = 0.0f, dx2 = 6.15f, dy2 = 1.95f, dx3 = 6.15f, dy3 = 6.15f)
                verticalLineToRelative(dy = 3.09f)
                curveTo(x1 = 20.63f, y1 = 15.95f, x2 = 22.0f, y2 = 14.55f, x3 = 22.0f, y3 = 11.1f)
                verticalLineTo(y = 6.9f)
                curveTo(x1 = 22.0f, y1 = 3.4f, x2 = 20.6f, y2 = 2.0f, x3 = 17.1f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.1f, y = 8.0f)
                horizontalLineTo(x = 6.9f)
                curveTo(x1 = 3.4f, y1 = 8.0f, x2 = 2.0f, y2 = 9.4f, x3 = 2.0f, y3 = 12.9f)
                verticalLineToRelative(dy = 4.2f)
                curveTo(x1 = 2.0f, y1 = 20.6f, x2 = 3.4f, y2 = 22.0f, x3 = 6.9f, y3 = 22.0f)
                horizontalLineToRelative(dx = 4.2f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 4.9f, dy2 = -1.4f, dx3 = 4.9f, dy3 = -4.9f)
                verticalLineToRelative(dy = -4.2f)
                curveTo(x1 = 16.0f, y1 = 9.4f, x2 = 14.6f, y2 = 8.0f, x3 = 11.1f, y3 = 8.0f)
                moveToRelative(dx = 1.19f, dy = 5.65f)
                lineToRelative(dx = -3.71f, dy = 3.71f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.21f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -0.21f)
                lineTo(x = 5.7f, y = 15.5f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.01f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = 0.0f)
                lineToRelative(dx = 1.35f, dy = 1.35f)
                lineToRelative(dx = 3.21f, dy = -3.21f)
                curveToRelative(dx1 = 0.28f, dy1 = -0.28f, dx2 = 0.73f, dy2 = -0.28f, dx3 = 1.01f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 0.29f, dy1 = 0.74f, dx2 = 0.01f, dy2 = 1.02f)
            }
        }.build().also { _copySuccess = it }
    }

@Suppress("ObjectPropertyName")
private var _copySuccess: ImageVector? = null
