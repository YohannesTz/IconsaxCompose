package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Python: ImageVector
    get() {
        val current = _python
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Python",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.6f, y = 7.6f)
                verticalLineTo(y = 3.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.6f, dy2 = -1.5f, dx3 = 1.4f, dy3 = -1.7f)
                quadToRelative(dx1 = 3.0f, dy1 = -0.45f, dx2 = 6.0f, dy2 = 0.0f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.1f, dx2 = 1.4f, dy2 = 0.8f, dx3 = 1.4f, dy3 = 1.7f)
                verticalLineToRelative(dy = 5.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.2f, dx2 = -1.0f, dy2 = 2.2f, dx3 = -2.2f, dy3 = 2.2f)
                horizontalLineTo(x = 9.8f)
                curveToRelative(dx1 = -1.2f, dy1 = 0.0f, dx2 = -2.2f, dy2 = 1.0f, dx3 = -2.2f, dy3 = 2.2f)
                verticalLineToRelative(dy = 5.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.8f, dx2 = 0.6f, dy2 = 1.5f, dx3 = 1.4f, dy3 = 1.7f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.45f, dx2 = 6.0f, dy2 = 0.0f)
                curveToRelative(dx1 = 0.8f, dy1 = -0.1f, dx2 = 1.4f, dy2 = -0.8f, dx3 = 1.4f, dy3 = -1.7f)
                verticalLineToRelative(dy = -3.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.4f, y = 7.6f)
                horizontalLineToRelative(dx = 3.7f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.5f, dy2 = 0.6f, dx3 = 1.7f, dy3 = 1.4f)
                quadToRelative(dx1 = 0.45f, dy1 = 3.0f, dx2 = 0.0f, dy2 = 6.0f)
                curveToRelative(dx1 = -0.1f, dy1 = 0.8f, dx2 = -0.8f, dy2 = 1.4f, dx3 = -1.7f, dy3 = 1.4f)
                horizontalLineTo(x = 12.0f)
                moveToRelative(dx = 0.0f, dy = -8.8f)
                horizontalLineTo(x = 3.9f)
                arcTo(horizontalEllipseRadius = 1.8f, verticalEllipseRadius = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.2f, y1 = 9.0f)
                quadToRelative(dx1 = -0.45f, dy1 = 3.0f, dx2 = 0.0f, dy2 = 6.0f)
                curveToRelative(dx1 = 0.1f, dy1 = 0.8f, dx2 = 0.8f, dy2 = 1.4f, dx3 = 1.7f, dy3 = 1.4f)
                horizontalLineToRelative(dx = 3.7f)
                moveToRelative(dx = 6.4f, dy = 2.75f)
            }
        }.build().also { _python = it }
    }

@Suppress("ObjectPropertyName")
private var _python: ImageVector? = null
