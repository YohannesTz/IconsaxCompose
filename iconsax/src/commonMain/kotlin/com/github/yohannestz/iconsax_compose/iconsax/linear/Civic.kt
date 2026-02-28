package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Civic: ImageVector
    get() {
        val current = _civic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Civic",
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
                moveTo(x = 14.3f, y = 10.1f)
                curveToRelative(dx1 = 0.3f, dy1 = 1.1f, dx2 = -0.2f, dy2 = 2.1f, dx3 = -1.0f, dy3 = 2.6f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = -0.6f, dy2 = 1.2f, dx3 = -1.2f, dy3 = 1.2f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.0f, dx2 = -1.2f, dy2 = -0.6f, dx3 = -1.2f, dy3 = -1.2f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = -4.3f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.3f, dx2 = 1.3f, dy2 = 0.9f, dx3 = 1.5f, dy3 = 1.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.6f, y = 9.0f)
                arcTo(horizontalEllipseRadius = 10.03f, verticalEllipseRadius = 10.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.5f, dx2 = 4.5f, dy2 = 10.0f, dx3 = 10.0f, dy3 = 10.0f)
                curveToRelative(dx1 = 4.5f, dy1 = 0.0f, dx2 = 8.3f, dy2 = -2.9f, dx3 = 9.5f, dy3 = -7.0f)
            }
        }.build().also { _civic = it }
    }

@Suppress("ObjectPropertyName")
private var _civic: ImageVector? = null
