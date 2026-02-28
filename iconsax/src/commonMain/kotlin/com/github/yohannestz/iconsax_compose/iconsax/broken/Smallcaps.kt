package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smallcaps: ImageVector
    get() {
        val current = _smallcaps
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Smallcaps",
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
                moveTo(x = 10.4f, y = 2.57f)
                horizontalLineToRelative(dx = 6.36f)
                arcToRelative(a = 1.85f, b = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.85f, dy1 = 1.85f)
                verticalLineToRelative(dy = 1.51f)
                moveToRelative(dx = -16.62f, dy = 0.0f)
                verticalLineTo(y = 4.42f)
                arcToRelative(a = 1.85f, b = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.85f, dy1 = -1.85f)
                horizontalLineToRelative(dx = 2.75f)
                moveTo(x = 10.3f, y = 18.1f)
                verticalLineTo(y = 2.57f)
                moveTo(x = 6.9f, y = 18.1f)
                horizontalLineToRelative(dx = 5.58f)
                moveToRelative(dx = 1.2f, dy = -7.76f)
                horizontalLineToRelative(dx = 7.01f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.32f, dy1 = 1.32f)
                verticalLineToRelative(dy = 0.8f)
                moveToRelative(dx = -5.93f, dy = 8.97f)
                verticalLineTo(y = 10.87f)
                moveToRelative(dx = -2.14f, dy = 10.56f)
                horizontalLineToRelative(dx = 4.28f)
            }
        }.build().also { _smallcaps = it }
    }

@Suppress("ObjectPropertyName")
private var _smallcaps: ImageVector? = null
