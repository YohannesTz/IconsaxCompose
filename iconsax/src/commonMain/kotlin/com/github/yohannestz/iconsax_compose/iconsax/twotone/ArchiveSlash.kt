package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveSlash: ImageVector
    get() {
        val current = _archiveSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveSlash",
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
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.68f, y = 8.71f)
                verticalLineToRelative(dy = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.01f, dx2 = -1.44f, dy2 = 2.86f, dx3 = -3.2f, dy3 = 1.88f)
                lineTo(x = 11.0f, y = 17.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.32f, y = 19.95f)
                verticalLineTo(y = 5.86f)
                arcTo(horizontalEllipseRadius = 3.87f, verticalEllipseRadius = 3.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.18f, y1 = 2.0f)
                horizontalLineToRelative(dx = 9.65f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 1.44f)
            }
        }.build().also { _archiveSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveSlash: ImageVector? = null
