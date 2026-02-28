package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Translate: ImageVector
    get() {
        val current = _translate
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Translate",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.06f, y = 18.67f)
                lineToRelative(dx = -2.14f, dy = -4.27f)
                lineToRelative(dx = -2.14f, dy = 4.27f)
                moveToRelative(dx = 0.4f, dy = -0.76f)
                horizontalLineToRelative(dx = 3.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.92f, y = 21.02f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.93f, y1 = 22.0f)
                arcToRelative(a = 5.08f, b = 5.08f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 5.08f, dy1 = -5.08f)
                moveToRelative(dx = -10.06f, dy = -8.0f)
                quadToRelative(dx1 = 0.08f, dy1 = 3.11f, dx2 = -3.02f, dy2 = 3.03f)
                horizontalLineTo(x = 5.01f)
                quadTo(x1 = 2.0f, y1 = 12.03f, x2 = 2.0f, y2 = 8.93f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.03f, dx2 = 3.02f, dy2 = -3.02f)
                horizontalLineToRelative(dx = 3.92f)
                quadToRelative(dx1 = 3.1f, dy1 = 0.0f, dx2 = 3.02f, dy2 = 3.02f)
                moveTo(x = 9.01f, y = 5.85f)
                horizontalLineTo(x = 4.95f)
                moveToRelative(dx = 2.02f, dy = -0.68f)
                verticalLineToRelative(dy = 0.68f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 5.84f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.06f, dy1 = 3.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.01f, y = 9.01f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.16f, y1 = 8.0f)
                moveTo(x = 2.0f, y = 15.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.0f, dy1 = 7.0f)
                lineToRelative(dx = -1.05f, dy = -1.75f)
                moveTo(x = 22.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.0f, dy1 = -7.0f)
                lineToRelative(dx = 1.05f, dy = 1.75f)
            }
        }.build().also { _translate = it }
    }

@Suppress("ObjectPropertyName")
private var _translate: ImageVector? = null
