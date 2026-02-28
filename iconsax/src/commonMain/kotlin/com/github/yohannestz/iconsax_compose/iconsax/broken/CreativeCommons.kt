package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CreativeCommons: ImageVector
    get() {
        val current = _creativeCommons
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CreativeCommons",
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
                moveTo(x = 10.88f, y = 14.15f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.89f, dy1 = 0.72f)
                arcTo(horizontalEllipseRadius = 2.87f, verticalEllipseRadius = 2.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.12f, y1 = 12.0f)
                arcToRelative(a = 2.86f, b = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.76f, dy1 = -2.15f)
                moveToRelative(dx = 7.0f, dy = 4.3f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.89f, dy1 = 0.72f)
                arcTo(horizontalEllipseRadius = 2.87f, verticalEllipseRadius = 2.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.12f, y1 = 12.0f)
                arcToRelative(a = 2.86f, b = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.76f, dy1 = -2.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _creativeCommons = it }
    }

@Suppress("ObjectPropertyName")
private var _creativeCommons: ImageVector? = null
