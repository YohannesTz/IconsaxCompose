package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentCopy: ImageVector
    get() {
        val current = _documentCopy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentCopy",
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
                moveTo(x = 15.5f, y = 13.15f)
                horizontalLineToRelative(dx = -2.17f)
                arcToRelative(a = 3.23f, b = 3.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.23f, dy1 = -3.23f)
                verticalLineTo(y = 7.75f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.35f, y1 = 7.0f)
                horizontalLineTo(x = 6.18f)
                curveTo(x1 = 3.87f, y1 = 7.0f, x2 = 2.0f, y2 = 8.5f, x3 = 2.0f, y3 = 11.18f)
                verticalLineToRelative(dy = 6.64f)
                curveTo(x1 = 2.0f, y1 = 20.5f, x2 = 3.87f, y2 = 22.0f, x3 = 6.18f, y3 = 22.0f)
                horizontalLineToRelative(dx = 5.89f)
                curveToRelative(dx1 = 2.31f, dy1 = 0.0f, dx2 = 4.18f, dy2 = -1.5f, dx3 = 4.18f, dy3 = -4.18f)
                verticalLineTo(y = 13.9f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = -0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.82f, y = 2.0f)
                horizontalLineToRelative(dx = -5.89f)
                curveTo(x1 = 9.67f, y1 = 2.0f, x2 = 7.84f, y2 = 3.44f, x3 = 7.76f, y3 = 6.01f)
                lineTo(x = 7.93f, y = 6.0f)
                horizontalLineToRelative(dx = 5.89f)
                curveTo(x1 = 16.13f, y1 = 6.0f, x2 = 18.0f, y2 = 7.5f, x3 = 18.0f, y3 = 10.18f)
                verticalLineToRelative(dy = 6.65f)
                lineToRelative(dx = -0.01f, dy = 0.16f)
                curveToRelative(dx1 = 2.23f, dy1 = -0.07f, dx2 = 4.01f, dy2 = -1.55f, dx3 = 4.01f, dy3 = -4.16f)
                verticalLineTo(y = 6.18f)
                curveTo(x1 = 22.0f, y1 = 3.5f, x2 = 20.13f, y2 = 2.0f, x3 = 17.82f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.98f, y = 7.15f)
                curveToRelative(dx1 = -0.31f, dy1 = -0.3f, dx2 = -0.84f, dy2 = -0.1f, dx3 = -0.84f, dy3 = 0.33f)
                verticalLineToRelative(dy = 2.62f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = 0.93f, dy2 = 2.0f, dx3 = 2.07f, dy3 = 2.0f)
                lineToRelative(dx = 2.55f, dy = 0.01f)
                curveToRelative(dx1 = 0.43f, dy1 = 0.0f, dx2 = 0.65f, dy2 = -0.5f, dx3 = 0.35f, dy3 = -0.8f)
                close()
            }
        }.build().also { _documentCopy = it }
    }

@Suppress("ObjectPropertyName")
private var _documentCopy: ImageVector? = null
