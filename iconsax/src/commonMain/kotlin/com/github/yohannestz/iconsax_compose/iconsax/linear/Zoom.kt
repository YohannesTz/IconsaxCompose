package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Zoom: ImageVector
    get() {
        val current = _zoom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Zoom",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.0f, y = 9.7f)
                verticalLineToRelative(dy = 2.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 1.3f, dy2 = 2.8f, dx3 = 2.8f, dy3 = 2.8f)
                horizontalLineToRelative(dx = 3.7f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.0f, dx2 = 0.9f, dy2 = -0.4f, dx3 = 0.9f, dy3 = -0.9f)
                verticalLineToRelative(dy = -2.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = -1.2f, dy2 = -2.8f, dx3 = -2.8f, dy3 = -2.8f)
                horizontalLineTo(x = 6.9f)
                arcTo(horizontalEllipseRadius = 0.9f, verticalEllipseRadius = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.0f, y1 = 9.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.0f, y = 9.2f)
                verticalLineToRelative(dy = 5.6f)
                lineToRelative(dx = -2.8f, dy = -1.9f)
                verticalLineToRelative(dy = -1.8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                close()
            }
        }.build().also { _zoom = it }
    }

@Suppress("ObjectPropertyName")
private var _zoom: ImageVector? = null
